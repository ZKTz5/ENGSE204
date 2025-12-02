package Lab2.Lab2_6;
import java.util.Scanner;

public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public String getownerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance = balance + amount;
        }
    }

    public void displayInfo() {
        System.out.println("Owner: " + this.ownerName);
        System.out.printf("Balance: %.2f\n", this.balance);
    }
}

class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        String ownerName = keyboard.nextLine();
        double initialBalance = keyboard.nextDouble();
        double Deposit = keyboard.nextDouble();
        keyboard.close();

        BankAccount s = new BankAccount(ownerName, initialBalance);
        s.deposit(Deposit);
        s.displayInfo();
    }
}  