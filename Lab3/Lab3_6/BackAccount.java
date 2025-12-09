package Lab3.Lab3_6;
import java.util.Scanner;

public class BackAccount {
    private double balance;

    public BackAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else if (initialBalance < 0) {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited successful.");
        } else if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal successful.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } 
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double initialBalance = keyboard.nextDouble();
        double depositAmount = keyboard.nextDouble();
        double withdrawAmount = keyboard.nextDouble();
        keyboard.close();

        BackAccount acc = new BackAccount(initialBalance);
        acc.deposit(depositAmount);
        acc.withdraw(withdrawAmount);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}