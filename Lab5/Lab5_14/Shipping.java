package Lab5_14;
import java.util.Scanner;

public class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double fee) {
        super(id, fee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double fee, double insuranceFee) {
        super(id, fee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        double total = super.calculateTotalFee() + insuranceFee;
        return total;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String sId = kb.nextLine();
        double sFee = kb.nextDouble();
        kb.nextLine();

        String pId = kb.nextLine();
        double pFee = kb.nextDouble();
        double pInsurance = kb.nextDouble();

        Shipping[] shipments = new Shipping[2];
        shipments[0] = new StandardShipping(sId, sFee);
        shipments[1] = new PremiumShipping(pId, pFee, pInsurance);

        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }

        kb.close();
    }
}