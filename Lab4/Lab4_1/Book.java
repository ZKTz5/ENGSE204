package Lab4.Lab4_1;
import java.util.Scanner;

public class Book {
    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo()  {
        System.out.println("Title: " + title + ", Autthor: " + author);
    }
}

class Main {
    public static void main(String[] agrs) {
        Scanner kb = new Scanner(System.in);

        int mode = kb.nextInt();
        kb.nextLine();

        if (mode == 1) {
            String title = kb.nextLine();
            Book b = new Book(title);
             b.displayInfo();
        }
        else if (mode == 2) {
            String title = kb.nextLine();
            String author = kb.nextLine();
            Book b = new Book(title, author);
            b.displayInfo();
        }
    }
}