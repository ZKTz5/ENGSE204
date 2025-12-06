package Lab3.Lab3_3;
import java.util.Scanner;

public class User {
    private String password;

    public User(String initialPassword) {
        if (initialPassword == null || initialPassword.isEmpty()) {
            throw new IllegalArgumentException("Error : Password cannot be null or empty");
        } 
        else if (initialPassword.length() < 8) {
            throw new IllegalArgumentException("Error : Password must be at least 8 characters long");
        } 
        else {
        this.password = initialPassword;
        }
    }

    public String getPassword() {return this.password;}

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 8) {
            System.out.println("Password updated.");
            this.password = newPassword;
        } else if (newPassword.length() < 8) {
            System.out.println("Password is too short.");
        }
    } 
}

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            String initialPassword = keyboard.nextLine();
            String newPassword = keyboard.nextLine();
         
            User u = new User(initialPassword);
            u.setPassword(newPassword);

            System.out.println(u.getPassword());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }     
}