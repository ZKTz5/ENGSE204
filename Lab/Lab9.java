package Lab;
import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("กรอกจำนวนเลข:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("กรอกจำนวนเต็มที่ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        
        double average = (double) sum / n;
        System.out.println("ค่าเฉลี่ย: " + average);

        scanner.close();
    }    
}
