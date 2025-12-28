package Lab5_10;
import java.util.Scanner;

public class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String description, int baseHours) {
        this.description = description;
        this.baseHours = baseHours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String desc, int hours, double fee) {
        super(desc, hours);
        this.setupFee = fee;
    }

    @Override
    public double calculateCost() {
        double cost = super.calculateCost() * 1.10;
        return cost + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String desc, int hours) {
        super(desc, hours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String cDesc = kb.nextLine();
        int cHours = kb.nextInt();
        double cFee = kb.nextDouble();
        kb.nextLine();

        String sDesc = kb.nextLine();
        int sHours = kb.nextInt();

        ProjectTask[] tasks = new ProjectTask[2];
        tasks[0] = new ComplexTask(cDesc, cHours, cFee);
        tasks[1] = new SimpleTask(sDesc, sHours);

        for (ProjectTask t : tasks) {
            System.out.println(t.calculateCost());
        }

        kb.close();
    }
}