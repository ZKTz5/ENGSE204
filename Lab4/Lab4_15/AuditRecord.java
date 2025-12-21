package Lab4.Lab4_15;
import java.util.Scanner;

public class AuditRecord {
    private final String user;
    private final String[] logMessages;
    private static int maxMessages = 3;

    public AuditRecord(String user) {
        this(user, new String[0]);
    }

    public AuditRecord(String user, String[] logs) {
        this.user = user;
        int count = Math.min(logs.length, maxMessages);
        this.logMessages = new String[count];
        for (int i = 0; i < count; i++) {
            this.logMessages[i] = logs[logs.length - count + i];
        }
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxMessages = max;
            System.out.println("Policy set to " + maxMessages);
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public AuditRecord addMessage(String message) {
        if (logMessages.length < maxMessages) {
            String[] newLogs = new String[logMessages.length + 1];
            for (int i = 0; i < logMessages.length; i++) {
                newLogs[i] = logMessages[i];
            }
            newLogs[logMessages.length] = message;
            return new AuditRecord(this.user, newLogs);
        } else {
            System.out.println("Log is full.");
            return this;
        }
    }

    public void displayLog() {
        System.out.print("User: " + user + ", Logs: [" + logMessages.length + "] ");
        for (int i = 0; i < logMessages.length; i++) {
            System.out.print(logMessages[i]);
            if (i < logMessages.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int max = kb.nextInt();
        kb.nextLine();
        AuditRecord.setPolicy(max);

        String user = kb.nextLine();
        AuditRecord record = new AuditRecord(user);

        int n = kb.nextInt();
        kb.nextLine();

        for (int i = 0; i < n; i++) {
            String msg = kb.nextLine();
            record = record.addMessage(msg);
        }

        record.displayLog();
        kb.close();
    }
}
