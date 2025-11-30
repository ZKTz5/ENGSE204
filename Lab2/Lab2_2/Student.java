package Lab2.Lab2_2;
import java.util.Scanner;

public class Student {
    private String studentID;
    private String name;


    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }
    public String getStudentID() {
        return this.studentID; 
    }

    public String getName() {
        return this.name;
    }

    public void displayInfo() {
        System.out.println(this.studentID);
        System.out.println(this.name);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String studentID = keyboard.nextLine();
        String name = keyboard.nextLine();

        keyboard.close();

        Student s = new Student(studentID, name);
        s.displayInfo();
    }
}
