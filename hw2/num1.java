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

    static void readFile() throws FileNotFoundException{
        File txt = new File("hw2/input.txt");
        Scanner scan = new Scanner(txt);
        ArrayList<String> data = new ArrayList<String>() ;
        while(scan.hasNextLine()){
            data.add(scan.nextLine());
        }
        System.out.println(data);
        String[] simpleArray = data.toArray(new String[]{});
    }
}
