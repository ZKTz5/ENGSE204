package Lab5_9;
import java.util.Scanner;

public class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String pName = kb.nextLine();
        double pPrice = kb.nextDouble();
        int pQty = kb.nextInt();
        kb.nextLine();

        String dName = kb.nextLine();
        double dCost = kb.nextDouble();
        int dMonths = kb.nextInt();

        Item[] items = new Item[2];
        items[0] = new PhysicalProduct(pName, pPrice, pQty);
        items[1] = new DigitalSubscription(dName, dCost, dMonths);

        double totalValue = 0.0;

        for (Item item : items) {
            totalValue = totalValue + item.getValue();
        }

        System.out.println(totalValue);

        kb.close();
    }
}