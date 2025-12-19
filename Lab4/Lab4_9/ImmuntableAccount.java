package Lab4.Lab4_9;
import java.util.Scanner;

public class ImmuntableAccount{
    private final String accountId;
    private final double balance;

    public ImmuntableAccount(String accountId, double balance) {
        this.accountId = accountId;
        if (balance < 0) {
            this.balance = 0.0;
        }else{
            this.balance = balance;
        }
    }

    public ImmuntableAccount(ImmuntableAccount other) {
        this.accountId = other.accountId;
        if (other.balance < 0) {
            this.balance = 0.0;
        }else{
            this.balance = other.balance;
        }
    }

    public ImmuntableAccount deposit(double amount) {
        if (amount > 0) {
            return new ImmuntableAccount(this.accountId, this.balance + amount);
        } else {
            System.out.println("Invalid deposit amount.");
            return this;
        }
    }

    public ImmuntableAccount withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            return new ImmuntableAccount(this.accountId, this.balance - amount);
        }else if (amount > balance) {
            System.out.println("Insufficient funds.");
            return this;
        }else {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }
    }

    public String getAccountId() { return accountId; }
    public double getBalance() { return balance; }

    public void displayInfo() {
        System.out.printf("ID: %s, Balance: %.1f%n", accountId, balance);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String id = kb.nextLine();
        double balance = kb.nextDouble();
        double deposit = kb.nextDouble();
        double withdraw = kb.nextDouble();
        kb.nextLine();

        ImmuntableAccount acc1 = new ImmuntableAccount(id,balance);
        ImmuntableAccount acc2 = acc1.deposit(deposit);
        ImmuntableAccount acc3 = acc2.withdraw(withdraw);

        acc1.displayInfo();
        acc3.displayInfo();

        kb.close();
    }
}