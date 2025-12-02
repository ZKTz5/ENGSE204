package Lab2.Lab2_10;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

}

class ShoppingCart {
    private Product[] items;
    private int itemCount;

    public ShoppingCart() {
        this.items = new Product[10];
        this.itemCount = 0;
    }

    public void addProduct(Product p) {
        if (this.itemCount < this.items.length) {
            this.items[this.itemCount] = p;
            this.itemCount++;
        }
    }

    public double calculateTotalPrice() {
        double total = 0;

        for (int i = 0; i < itemCount; i++) {
            total += this.items[i].getPrice();
        }

        return total;
    }
}

class main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        ShoppingCart c = new ShoppingCart();

        for (int i = 0; i < n; i++) {
            keyboard.nextLine();
            String name = keyboard.nextLine();
            double price = keyboard.nextDouble();

            Product p = new Product(name, price);
            c.addProduct(p);
            
        }

        keyboard.close();

        System.out.println(c.calculateTotalPrice());
        
    }
}