import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        int n = input();
        //int t = calculate(n);
        //print(t);
        
    }
    public static int input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N(порядок треугольного числа): ");
        int line = scanner.nextInt();
        scanner.close();
        return line;
    }

    
}