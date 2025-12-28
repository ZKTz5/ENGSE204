package Lab5_3;
import java.util.Scanner;

public class Employee {
    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (salary * 0.05);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double inputSalary = kb.nextDouble();

        Manager myManager = new Manager();
        myManager.salary = inputSalary;

        System.out.println(myManager.calculateBonus());

        kb.close();
    }
}