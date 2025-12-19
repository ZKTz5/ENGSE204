package Lab4.Lab4_8;
import java.util.Scanner;

public class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknow");
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = validate(rating);
    }

    private double validate(double value) {
        if(value > 10.0) { return 10.0; }
        if(value < 0.0) {return 0.0; }
        return value;
    }

    public void displayDetail() {
        System.out.printf("Title: %s, Director: %s, Rating: %.2f%n", title, director, rating);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int mode = kb.nextInt();
        kb.nextLine();

        if (mode == 1) {
            String title = kb.nextLine();

            Movie m1 = new Movie(title);
            m1.displayDetail();
        }else if (mode == 2) {
            String title = kb.nextLine();
            String director = kb.nextLine();

            Movie m1 = new Movie(title, director);
            m1.displayDetail();
        }else if (mode == 3) {
            String title = kb.nextLine();
            String director = kb.nextLine();
            double rating = kb.nextDouble();

            Movie m1 = new Movie(title, director,rating);
            m1.displayDetail();
        }
    }
}