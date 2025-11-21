package Lab;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("กรอกจำนวนเ:");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++) {
            System.out.print("กรอกจำนวนเต็มที่ " + (i + 1) + ": ");
            int number = scanner.nextInt();
            sum = number + sum;
        }
        System.out.println("ผลรวม: " + sum);
        
        scanner.close();
    }    
}
