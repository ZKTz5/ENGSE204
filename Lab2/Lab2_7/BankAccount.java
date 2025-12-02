package Lab2.Lab2_7;
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

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance = balance - amount;
            System.out.println("Withdraw successful");
        }
        else if (amount > this.balance) {
            System.out.println("Insufficient funds");
        }
    }

    public void displayInfo() {
        System.out.printf("Balance: %.2f\n", this.balance);
    }
}

class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       
        String ownerName = keyboard.nextLine();
        double initialBalance = keyboard.nextDouble();
        double Withdraw = keyboard.nextDouble();
        double Withdraw2 = keyboard.nextDouble();
        keyboard.close();

        BankAccount s = new BankAccount(ownerName, initialBalance);
        s.withdraw(Withdraw);
        s.withdraw(Withdraw2);
        s.displayInfo();
    }
}  