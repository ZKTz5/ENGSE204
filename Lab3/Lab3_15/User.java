package Lab3.Lab3_15;
import java.util.Scanner;

public class User {
    private String username;
    private int failedAttemps;
    private boolean isLocked;
    private static int maxAttempts = 3;

    public User(String username) {
        this.username = username;
        this.failedAttemps = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else if(max <= 0) {
            System.out.println("Invalid policy.");
        }
    }

    public String getUsername() { return null; }

    public boolean isLocked() { return isLocked; }

    public int getFailedAttemps() { return failedAttemps; }

    public void login(String password) {
        if (isLocked) {
            System.out.println("Account is locked.");
        } else if (!isLocked && password.equals("pass123")) {
            failedAttemps = 0;
            System.out.println("Login successful.");
        } else {
            failedAttemps++;
            if (failedAttemps >= maxAttempts) {
                isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                System.out.println("Login Failed. " + (maxAttempts - failedAttemps) + " attempts left.");
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String username = keyboard.nextLine();
        User user1 = new User(username);

        int N = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < N; i++) {
            String command = keyboard.nextLine();

            if (command.equals("SET_POLICY")) {
                int max = keyboard.nextInt();
                keyboard.nextLine();
                User.setPolicy(max);
            } else if (command.equals("LOGIN")) {
                String password = keyboard.nextLine();
                user1.login(password);
            }
        }
    }
}
