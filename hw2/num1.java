package hw2;

import java.io.*;
import java.util.*;

public class num1 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static ArrayList<Integer> readFile() throws FileNotFoundException{
        File txt = new File("hw2/input.txt");
        Scanner scan = new Scanner(txt);
        ArrayList<String> data = new ArrayList<String>();
        while(scan.hasNextLine()){
            data.add(scan.nextLine());
        }
        String[] arr = null;
        String b_ = data.get(0);
        arr = b_.split(" ");
        int b = Integer.parseInt(arr[1]);

        String a_ = data.get(1);
        arr = a_.split(" ");
        int a = Integer.parseInt(arr[1]);

        ArrayList<Integer> finalArray = new ArrayList<Integer>();
        finalArray.add(a);
        finalArray.add(b);
        
        return finalArray;
    }
}
