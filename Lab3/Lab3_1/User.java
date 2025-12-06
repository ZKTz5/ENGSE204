package Lab3.Lab3_1;
import java.util.Scanner;

public class User {
    private String username;

    public User(String username) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Error : Username cannot be null or empty");
        } 
        else if (username.length() < 5) {
            throw new IllegalArgumentException("Error : Username cannot be null or empty");
        } else {
            this.username = username;
        }
    }

    public String getUsername() {return this.username;}
}

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            String username = keyboard.nextLine();
         
            User u = new User(username);

            System.out.println(u.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }     
}   