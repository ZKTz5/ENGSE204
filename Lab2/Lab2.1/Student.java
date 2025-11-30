package Lab2.1;
import java.util.Scanner;

public class Student {
    private String studentID;
    private String name;
}
public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    
    String name = kb.nextLine();
    String studentID = kb.nextLine();

    System.out.println(name);
    System.out.println(studentID);

    scanner.close();
}
