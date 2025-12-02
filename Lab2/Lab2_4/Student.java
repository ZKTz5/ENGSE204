package Lab2.Lab2_4;
import java.util.Scanner;

public class Student {
    private String name;
    private int midtermScore;
    private int finalScore;

    public Student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public String getName() {
        return this.name;
    }

    public int getMidtermScore() {
        return this.midtermScore;
    }

    public int getFinalScore() {
        return this.finalScore;
    }

    public double calculateAverage() {
        return (this.midtermScore + this.finalScore) / 2.0;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.printf("Average Score: %.2f\n", calculateAverage());
        if (calculateAverage() >= 50) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.nextLine();
        int midtermScore = keyboard.nextInt();
        int finalScore = keyboard.nextInt();
        Student s = new Student(name, midtermScore, finalScore);

        keyboard.close();

        s.displayInfo();

    }
}