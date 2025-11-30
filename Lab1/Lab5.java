package Lab1;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coffee;
        int menu = scanner.nextInt();
        if (menu == 1) {
            coffee = "Americano";
        } else if (menu == 2) {
            coffee = "Latte";
        } else if (menu == 3) {
            coffee = "Espresso";
        } else if (menu == 4) {
            coffee = "Mocha";
        } else {
            coffee = "Invalid Menu";
        }
        
        scanner.close();
    }
}
