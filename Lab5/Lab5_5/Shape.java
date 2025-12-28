package Lab5_5;
import java.util.Scanner;

public class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Rectangle extends Shape {
    protected double width, height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double r = kb.nextDouble();
        double w = kb.nextDouble();
        double h = kb.nextDouble();

        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle("Circle", r);
        shapes[1] = new Rectangle("Rectangle", w, h);

        for (Shape s : shapes) {
            System.out.println(s.calculateArea());
        }

        kb.close();
    }
}