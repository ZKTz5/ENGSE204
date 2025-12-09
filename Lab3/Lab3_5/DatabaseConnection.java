package Lab3.Lab3_5;
import java.util.Scanner;

public class DatabaseConnection {
    private String connectionString;
    private boolean connected;

    public DatabaseConnection(String connectionString) {
        if (connectionString == null || connectionString.isEmpty()) {
            throw new IllegalArgumentException("Error : Connection string cannot be null or empty");
        } else {
            this.connectionString = connectionString;
            this.connected = false;
        }
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void connect() {
        if (!this.connected) {
            this.connected = true;
            System.out.println("Connected to " + connectionString);
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (this.connected) {
            this.connected = false;
            System.out.println("Disconnected");
        } else {
            System.out.println("Already disconnected");
        
        }
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            String connectionString = keyboard.nextLine();
            
            DatabaseConnection db = new DatabaseConnection(connectionString);
            db.connect();
            db.disconnect();
            db.disconnect();
            System.out.println(db.isConnected());
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}