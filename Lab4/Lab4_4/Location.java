package Lab4.Lab4_4;
import java.util.Scanner;

public class Location {
    private double latitude;
    private double longtitude;

    public Location(double latitude, double longtitude) {
        this.latitude = latitude;
        this.longtitude = longtitude;
    }

    public Location(Location other) {
        this.latitude = other.latitude;
        this.longtitude = other.longtitude;
    }

    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }

    public void displayInfo() {
        System.out.printf("Lat: %s, Lon: %s%n", latitude, longtitude);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double latitude = kb.nextDouble();
        double longtitude = kb.nextDouble();
        double newLat = kb.nextDouble();

        Location loc1 = new Location(latitude, longtitude);
        Location loc2 = new Location(loc1);

        loc1.setLatitude(newLat);
        loc1.displayInfo();
        loc2.displayInfo();

        kb.close();
    }
}