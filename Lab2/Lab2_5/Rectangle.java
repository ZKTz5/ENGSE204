package Lab2.Lab2_5;
import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}

class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double length = keyboard.nextDouble();
        double width = keyboard.nextDouble();
        keyboard.close();

        Rectangle s = new Rectangle(length, width);

        System.out.println(s.getArea());
        System.out.println(s.getPerimeter());
    }
}
