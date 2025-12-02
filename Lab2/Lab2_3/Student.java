package Lab2.Lab2_3;
import java.util.Scanner;

public class Student {
    private String studentID;
    private String name;

    public static int studentCount = 0;
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        studentCount++;
    }
    public String getStudentID() {
        return this.studentID; 
    }

    public String getName() {
        return this.name;
    }

}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 0; i < n; i++) {
            String studentID = keyboard.nextLine();
            String name = keyboard.nextLine();
            new Student(studentID, name);
        }

        keyboard.close();

        System.out.println(Student.studentCount);
    }
}
