package Lab3.Lab3_14;
import java.util.Scanner;

public class BankAccount {
    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
            System.out.println("Account created.");
        } else {
            this.balance = 0;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public static double getTotalTransactionCount() {
        return totalTransactionCount;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BankAccount myAccount = null;

        int N = keyboard.nextInt();
        keyboard.nextLine();
        for(int i = 0;  i < N; i++){
            String command = keyboard.nextLine();
            if(command.equals("CREATE")){
                double initialBalance = keyboard.nextDouble();
                keyboard.nextLine();
                myAccount = new BankAccount(initialBalance);
            } else if(command.equals("DEPOSIT")){
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    double amount = keyboard.nextDouble();
                    keyboard.nextLine();
                    myAccount.deposit(amount);
                }
            } else if(command.equals("WITHDRAW")){
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    double amount = keyboard.nextDouble();
                    keyboard.nextLine();
                    myAccount.withdraw(amount);
                }
            } else if (command.equals("STATUS")) {
                if (myAccount == null) {
                    System.out.println("No account exists.");
                } else {
                    System.out.println("Balance: " + myAccount.getBalance());
                }
            } else if (command.equals("GLOBAL_STATUS")) {
                System.out.println("Total Transactions: " + BankAccount.getTotalTransactionCount());
            }
        }
    }
}