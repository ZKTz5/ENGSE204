package Lab;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("กรอกจำนวนเลข:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("กรอกจำนวนเต็มที่ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for(int i = 0; i < n; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("ค่ามากที่สุด: " + max);

        scanner.close();
    }    
}
