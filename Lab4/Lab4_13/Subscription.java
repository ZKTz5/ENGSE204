package Lab4.Lab4_13;

import java.util.Scanner;

public class Subscription {
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        this.planName = planName;
        if (durationDays > maxDuration) {
            this.durationDays = maxDuration;
        } else if (durationDays < 0) {
            this.durationDays = 0;
        } else {
            this.durationDays = durationDays;
        }
    }

    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.printf("Max duration set to %s%n", max);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int newDays = this.durationDays + days;
        if (newDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(this.planName, newDays);
        
    }

    public void displayInfo() {
        System.out.printf("Plan: %s, Days: %d%n", planName, durationDays);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int maxDur = kb.nextInt();
        Subscription.setMaxDuration(maxDur);
        kb.nextLine();

        String name = kb.nextLine();
        int days = kb.nextInt();
        int extDays = kb.nextInt();
        int extDays2 = kb.nextInt();

        Subscription sub1 = new Subscription(name, days);
        Subscription sub2 = sub1.extend(extDays);
        Subscription sub3 = sub2.extend(extDays2);

        sub3.displayInfo();

        kb.close();
    }
}