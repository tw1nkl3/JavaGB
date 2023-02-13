package hw1;

import java.util.Scanner;

public class num1 {
    public static void main(String[] args) {
        
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
}
