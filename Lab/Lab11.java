package Lab;
import java.util.Scanner;

public class Lab11 {
    public static int sumArray(int[] numbers) {
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("กรอกจำนวนเลข:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("กรอกจำนวนเต็มที่ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = sumArray(numbers);
        System.out.println("ผลรวม: " + sum);

        scanner.close();
    }
}
