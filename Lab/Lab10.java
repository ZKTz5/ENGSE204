package Lab;
import java.util.Scanner;

public class Lab10 {
    public static double calculateArea(double width, double height) {
        double result = width * height;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("กรอกความกว้าง:");
        double width = scanner.nextDouble();

        System.out.print("กรอกความสูง:");
        double height = scanner.nextDouble();

        double area = calculateArea(width, height);
        System.out.println("พื้นที่: " + area);

        scanner.close();
    }    
}
