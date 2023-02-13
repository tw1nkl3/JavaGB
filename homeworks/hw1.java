package homeworks;

import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        int n = input();
        int t = calculate(n);
        print(t);
        
    }
    public static int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N(порядок треугольного числа): ");
        int line = scanner.nextInt();
        scanner.close();
        return line;
    }

    public static int calculate(int num){
        return (num*(num + 1)) / 2;
    }

    public static void print(int t){
        System.out.println(t);
    }
}