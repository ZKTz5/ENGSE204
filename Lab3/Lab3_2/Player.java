package Lab3.Lab3_2;
import java.util.Scanner;

public class Player {
    private int score;

    public Player() {
        this.score = 0;
    }

    public int getScore() {return this.score;}

    public void setScore(int newScore) {
        if (newScore < 0) {
            throw new IllegalArgumentException("Error : Score cannot be negative");
        } else if (newScore < this.score) {
            throw new IllegalArgumentException("Error : Score cannot be lower than current score");
        } else {
            this.score = newScore;
        }
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            int initialScore = keyboard.nextInt();
            int UpdateScore = keyboard.nextInt();

            Player p = new Player();

            p.setScore(initialScore);
            p.setScore(UpdateScore);
            System.out.println(p.getScore());
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}