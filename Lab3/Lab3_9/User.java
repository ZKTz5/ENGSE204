package Lab3.Lab3_9;

import java.util.Scanner;

public class User {
    private String username;
    private String password;

    private static int minPasswordLength = 8;

    public User(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        } else if (password == null || password.length() < minPasswordLength) {
            this.password = "invalid";
            System.out.println("Creation failed.");
        } else {
            this.username = username;
            this.password = password;
            System.out.println("Created successful.");
        }
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if (newPassword == null || newPassword.length() < minPasswordLength) {
            System.out.println("Update failed.");
        } else {
            this.password = newPassword;
            System.out.println("Update successful.");
        }
    }

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else if (length >= 4) {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            int minLength1 = keyboard.nextInt();
            keyboard.nextLine();
            String user1_name = keyboard.nextLine();
            String user1_pass = keyboard.nextLine();
            String user2_name = keyboard.nextLine();
            String user2_pass = keyboard.nextLine();
            int minLength2 = keyboard.nextInt();
            keyboard.nextLine();
            String user2_newPass = keyboard.nextLine();

            User.setMinLength(minLength1);
            User user1 = new User(user1_name, user1_pass);
            User user2 = new User(user2_name, user2_pass);
            User.setMinLength(minLength2);
            user2.setPassword(user2_newPass);
            
            System.out.println(user1.getPassword());
            System.out.println(user2.getPassword());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
