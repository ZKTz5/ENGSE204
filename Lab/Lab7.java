package Lab;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++) {
            int number = keyboard.nextInt();
            sum = number + sum;
        }
        System.out.println(sum);
        
        keyboard.close();
    }    
}
