package hw2;

import java.io.*;
import java.util.*;
import java.lang.Math;

public class num1 {
    public static void main(String[] args) throws IOException {
        String[] readedArr = readFile();
        double res = exponentiation(readedArr);
        writeFile(res);
    }

    static String[] readFile() throws FileNotFoundException{
        File txt = new File("hw2/input.txt");
        Scanner scan = new Scanner(txt);
        ArrayList<String> data = new ArrayList<String>();
        while(scan.hasNextLine()){
            data.add(scan.nextLine());
        }
        String[] arr = null;
        String b_ = data.get(0);
        arr = b_.split(" ");
        String b = arr[1];

        String a_ = data.get(1);
        arr = a_.split(" ");
        String a = arr[1];

        String[] finalArray = new String[]{a, b};
        scan.close();

        return finalArray;
    }

    static double exponentiation(String[] readedArr){
        double b = Double.parseDouble(readedArr[1]);
        double a = Double.parseDouble(readedArr[0]);
        double result = Math.pow(a, b);

        return result;
    }

    static void writeFile(double res) throws IOException{
        FileWriter writer = new FileWriter("hw2/output.txt", false);
        StringBuilder sb = new StringBuilder();
        sb.append(res);
        String out = sb.toString();
        writer.write(out);
        writer.flush();
        writer.close();
    }

}
