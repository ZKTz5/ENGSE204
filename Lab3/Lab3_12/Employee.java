package Lab3.Lab3_12;
import java.util.Scanner;

public class Employee {
    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary <= 0) {
            this.monthlySalary = 0;                                                                                                                     
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    public String getNane() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return this.monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
            return getAnnualSalary() * taxRate;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.nextLine();
        double monthlySalary = keyboard.nextDouble();
        double taxRate = keyboard.nextDouble();
        double raiseAmount = keyboard.nextDouble();

        Employee emp = new Employee(name, monthlySalary);
        System.out.printf("Tax (Before): %.2f%n", emp.calculateTax(taxRate));
        emp.giveRaise(raiseAmount);
        System.out.printf("Tax (After): %.2f%n", emp.calculateTax(taxRate));
    }
}
