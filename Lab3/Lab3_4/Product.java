package Lab3.Lab3_4;
import java.util.Scanner;

public class Product {
    private String name;
    private static int productCount = 0;

    public Product(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Error : Name cannot be null or empty");
        } else {
            this.name = name;
            productCount++;
        }
    }

    public String getName() {
        return this.name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)){

            int n = keyboard.nextInt();
            keyboard.nextLine();

            for (int i = 0; i < n; i++) {
            String name = keyboard.nextLine();
            Product p = new Product(name);
            }

            System.out.println(Product.getProductCount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}