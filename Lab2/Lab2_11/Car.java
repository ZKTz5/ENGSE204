package Lab2.Lab2_11;
import java.util.Scanner;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }
}

class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String model = keyboard.nextLine();
        int year = keyboard.nextInt();
        int newYear = keyboard.nextInt();
        keyboard.close();

        Car c = new Car(model, year);
        c.setYear(newYear);
        System.out.println("Model: " + c.getModel());
        System.out.println("Years: " + c.getYear());
    }
}
