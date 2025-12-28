package Lab5_15;
import java.util.Scanner;

public class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {
    public Car(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        double total = rentalRate + 100.0;
        return total;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        double total = rentalRate * 1.10;
        return total;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String cModel = kb.nextLine();
        double cRate = kb.nextDouble();
        kb.nextLine();

        String mModel = kb.nextLine();
        double mRate = kb.nextDouble();

        RentalVehicle[] vehicles = new RentalVehicle[2];
        vehicles[0] = new Car(cModel, cRate);
        vehicles[1] = new Motorcycle(mModel, mRate);

        double totalRentalFee = 0.0;

        for (RentalVehicle v : vehicles) {
            totalRentalFee = totalRentalFee + v.calculateFee();
        }

        System.out.println(totalRentalFee);

        kb.close();
    }
}