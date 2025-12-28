package Lab5_12;
import java.util.Scanner;

public class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String bName = kb.nextLine();
        double bPrice = kb.nextDouble();
        kb.nextLine();

        String pName = kb.nextLine();
        double pPrice = kb.nextDouble();
        double pRate = kb.nextDouble();

        Service[] services = new Service[2];
        services[0] = new BasicService(bName, bPrice);
        services[1] = new PremiumService(pName, pPrice, pRate);

        for (Service s : services) {
            System.out.println(s.calculateFinalPrice());
        }

        kb.close();
    }
}