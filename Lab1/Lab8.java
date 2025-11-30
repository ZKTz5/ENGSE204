package Lab1;
import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        int[] numbers = new int[n];
        for(int i = 0; i < n; i++) {
            numbers[i] = keyboard.nextInt();
        }

        int max = numbers[0];
        for(int i = 0; i < n; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println(max);

        keyboard.close();
    }    
}
