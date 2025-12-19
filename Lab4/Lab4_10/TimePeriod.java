package Lab4.Lab4_10;

import java.util.Scanner;

public class TimePeriod {
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {
        startHour = validate(startHour);
        endHour = validate(endHour);

        if (startHour > endHour) {
            int temp = startHour;
            startHour = endHour;
            endHour = temp;
        }

        this.startHour = startHour;
        this.endHour = endHour;
    }

    private int validate(int value) {
        if (value < 0) {
            return 0;
        }
        if (value > 23) {
            return 23;
        }
        return value;
    }

    public void displayPeriod() {
        System.out.printf("%s:00 - %s:00%n", startHour, endHour);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int mode = kb.nextInt();
        if (mode == 1) {
            TimePeriod time1 = new TimePeriod();
            time1.displayPeriod();
        } else if (mode == 2) {
            int start = kb.nextInt();
            int end = kb.nextInt();

            TimePeriod time1 = new TimePeriod(start, end);
            time1.displayPeriod();
        }
    }
}
