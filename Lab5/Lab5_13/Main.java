package Lab5_13;
import java.util.Scanner;

class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public int getClearanceLevel() {
        return 1;
    }
}

class Developer extends User {
    protected int projects;

    public Developer(String name, int projects) {
        super(name);
        this.projects = projects;
    }

    @Override
    public int getClearanceLevel() {
        return 2;
    }
}

class Admin extends Developer {
    protected String adminKey;

    public Admin(String name, int projects, String adminKey) {
        super(name, projects);
        this.adminKey = adminKey;
    }

    @Override
    public int getClearanceLevel() {
        return 3;
    }

    public String getAdminKey() {
        return adminKey;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String dName = kb.nextLine();
        int dProjects = kb.nextInt();
        kb.nextLine();

        String aName = kb.nextLine();
        int aProjects = kb.nextInt();
        kb.nextLine();
        String aKey = kb.nextLine();

        User u1 = new User("Guest");
        Developer d1 = new Developer(dName, dProjects);
        Admin a1 = new Admin(aName, aProjects, aKey);

        User[] users = new User[3];
        users[0] = u1;
        users[1] = d1;
        users[2] = a1;

        int totalClearance = 0;

        for (User u : users) {
            totalClearance = totalClearance + u.getClearanceLevel();
        }

        for (User u : users) {
            if (u instanceof Admin) {
                Admin adm = (Admin) u;
                System.out.println(adm.getAdminKey());
            }
        }

        System.out.println(totalClearance);

        kb.close();
    }
}