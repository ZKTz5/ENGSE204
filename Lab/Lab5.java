package Lab;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 = \"Americano\"\r\n" + //
                        "2 = \"Latte\"\r\n" + //
                        "3 = \"Espresso\"\r\n" + //
                        "4 = \"Mocha\"");
        int coffee = scanner.nextInt();
        
        switch (coffee) {
            case 1:
                System.out.println("Americano");
                break;
            case 2:
                System.out.println("Latte");
                break;
            case 3:
                System.out.println("Espresso");
                break;
            case 4:
                System.out.println("Mocha");
                break;
            default:
                System.out.println("Invalid menu");
                break;
        }
        
        scanner.close();
    }
}
