package Lab3.Lab3_10;

import java.util.Scanner;

public class SystemLogger {
    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        switch (level) {
            case 1:
                return "INFO";
            case 2:
                return "DEBUG";
            case 3:
                return "ERROR";
            default:
                return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel < 1 || newLevel > 3) {
            System.out.println("Invalid log level.");
        } else {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        }
    }

    public static void logMessage(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
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
            if (command.equals("SET")) {
                int level = keyboard.nextInt();
                keyboard.nextLine();
                SystemLogger.setLogLevel(level);
            } else if (command.equals("LOG")) {
                int level = keyboard.nextInt();
                keyboard.nextLine();
                String message = keyboard.nextLine();
                SystemLogger.logMessage(level, message);
            }
        }
    }
}

