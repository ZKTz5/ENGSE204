package Lab3.Lab3_11;
import java.util.Scanner;

public class SystemConfig {
    private static SystemConfig instance;

    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else if (count <= 0) {
            System.out.println("Invalid count.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int N = keyboard.nextInt();
        keyboard.nextLine();
        for (int i = 0; i < N; i++) {
            String command = keyboard.nextLine();

            if (command.equals("SET_URL")) {
                SystemConfig config = SystemConfig.getInstance();
                String url = keyboard.nextLine();
                config.setServerUrl(url);
            } else if (command.equals("SET_MAX")) {
                SystemConfig config = SystemConfig.getInstance();
                int max = keyboard.nextInt();
                keyboard.nextLine();
                config.setMaxConnections(max);
            } else if (command.equals("SHOW")) {
                SystemConfig config = SystemConfig.getInstance();
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }
    }
}