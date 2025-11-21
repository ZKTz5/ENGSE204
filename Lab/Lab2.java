package Lab;
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ความกว้าง:");
        double num1 = scanner.nextDouble();

        System.out.println("ความยาว:");
        double num2 = scanner.nextDouble();

        double sum = num1 * num2;

        System.out.println("ผลลัพธ์ = " + sum);
        
        scanner.close();
    }
}