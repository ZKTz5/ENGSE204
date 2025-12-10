package Lab3.Lab3_13;
import java.util.Scanner;

public class LicenseManager {
    private static int maxLicenses = 10;
    private static int usedLicenses = 0;

    public static void setMax(int max) {
        if (max < 0) {
            System.out.println("Invalid max value.");
        } else if (max < usedLicenses) {
            System.out.println("Cannot set max lower than current usage.");
        } else {
            maxLicenses = max;
            System.out.println("Max licenses set to " + max);
        }
    }

    public  static boolean checkOut() {
        if (usedLicenses < maxLicenses) {
            usedLicenses++;
            System.out.println("Checkout successful.");
            return true;
        } else {
            System.out.println("Checkout fialed: No license available.");
            return false;
        }
    }

    public static void checkIn() {
        if (usedLicenses > 0) {
            usedLicenses--;
            System.out.println("Check-in successful.");
        } else {
            System.out.println("Nothing to check-in.");
        }
    }

    public static void displayStatus() {
        System.out.println("Used: " + usedLicenses);
        System.out.println("Available: " + (maxLicenses - usedLicenses));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int N = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < N; i++) {
            String command = keyboard.nextLine();

            if (command.equals("SET")) {
                int max = keyboard.nextInt();
                keyboard.nextLine();
                LicenseManager.setMax(max);
            } else if (command.equals("CHECKOUT")) {
                LicenseManager.checkOut();
            } else if (command.equals("CHECKIN")) {
                LicenseManager.checkIn();
            } else if (command.equals("STATUS")) {
                LicenseManager.displayStatus();
            }
        }
    }
}
