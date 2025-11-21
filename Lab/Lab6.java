package Lab;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("กรอกจำนวนเต็ม:");
        int number = scanner.nextInt();

        for (int i = 0; i < 12; i++) {
            int result = number * (i + 1);
            System.out.println(number + " x " + (i + 1) + " = " + result);
        }

        scanner.close();
    }    
}
