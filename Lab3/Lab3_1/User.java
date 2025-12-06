package Lab3.Lab3_1;
import java.util.Scanner;

public class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String username = keyboard.nextLine();
        keyboard.close();
         
        User u = new User(username);
        System.out.println(u.getUsername());
    }
}        
