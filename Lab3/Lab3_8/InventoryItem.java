package Lab3.Lab3_8;

import java.util.Scanner;

public class InventoryItem {
    private String productName;
    private int stock;

    public InventoryItem(String productName, int initialStock) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Error : Product name cannot be null or empty");
        } else if (initialStock >= 0) {
            this.productName = productName;
            this.stock = initialStock;
        } else if (initialStock < 0) {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return this.productName;
    }

    public int getStock() {
        return this.stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            this.stock += amount;
            System.out.println("Stock added.");
        } else if (amount <= 0) {
            System.out.println("Invalid  amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount > 0 && amount <= this.stock) {
            this.stock -= amount;
            System.out.println("Sale successful.");
        } else if (amount > this.stock) {
            System.out.println("Not Enough stock.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            String productName = keyboard.nextLine();
            int initialStock = keyboard.nextInt();

            InventoryItem item = new InventoryItem(productName, initialStock);

            int n = keyboard.nextInt();
            for (int i = 0; i < n; i++) {
                String command = keyboard.next();
                int amount = keyboard.nextInt();

                if (command.equals("ADD")) {
                    item.addStock(amount);
                } else if (command.equals("SELL")) {
                    item.sellStock(amount);
                } else {
                    System.out.println("Error : Invalid command.");
                }
            }
            System.out.println("Final Stock: " + item.getStock());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
