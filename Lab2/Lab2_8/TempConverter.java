package Lab2.Lab2_8;
import java.util.Scanner;

public class TempConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0/9.0;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String Mode = keyboard.nextLine();
        if (Mode.equals("CtoF")) {
            double celsius = keyboard.nextDouble();
            System.out.printf("%.2f\n", TempConverter.celsiusToFahrenheit(celsius));
        } else if (Mode.equals("FtoC")) {
            double fahrenheit = keyboard.nextDouble();
            System.out.printf("%.2f\n", TempConverter.fahrenheitToCelsius(fahrenheit));
        }


    }
}