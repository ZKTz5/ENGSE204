package Lab5_4;
import java.util.Scanner;

public class Vehicle {
    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    protected int wheels;

    public Car(String color, int wheels) {
        super(color);
        this.wheels = wheels;
    }

    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String inputColor = kb.nextLine();
        int inputWheels = kb.nextInt();

        Car myCar = new Car(inputColor, inputWheels);
        myCar.displayDetails();

        kb.close();
    }
}