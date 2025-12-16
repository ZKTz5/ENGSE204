package Lab4.Lab4_2;
import java.util.Scanner;

public class Product {
    private String name;
    private double price;

    public Product(String name) {
        this(name,0.0);
    }
  
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + ", Price " + price);
    }
}

class Main {
    public static void main(String[] agrs) {
        Scanner kb = new Scanner(System.in);

        int mode = kb.nextInt();
        kb.nextLine();

        if (mode == 1) {
            String name = kb.nextLine();
            Product p = new Product(name);
            p.displayInfo();
        }else if (mode == 2) {
            String name = kb.nextLine();
            double price = kb.nextInt();
            Product p = new Product(name, price);
            p.displayInfo();
        }
        kb.close();
    }
}