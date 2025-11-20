package Lab;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ป้อนจำนวนเต็มตัวที่ 1:");
        int num1 = scanner.nextInt();

        System.out.println("ป้อนจำนวนเต็มตัวที่ 2:");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("--- ผลลัพธ์ ---");
        System.out.println("ผลบวกของ " + num1 + " และ " + num2 + " คือ: " + sum);
        
        scanner.close();
    }
}