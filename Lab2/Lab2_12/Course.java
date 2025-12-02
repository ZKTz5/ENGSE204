package Lab2.Lab2_12;
import java.util.Scanner;

public class Course {
    private String courseId;
    private String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getCourseId() {
        return this.courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getCourseInfo() {
        return this.courseId + ": " + this.courseName;
    }
}

class Student {
    private String studentName;
    private Course enrolledCourse;

    public Student(String studentName, Course enrolledCourse) {
        this.studentName = studentName;
        this.enrolledCourse = enrolledCourse;
    }

    public void displayEnrollment() {
        System.out.println("Student: " + this.studentName);
        System.out.println("Enrolled In: " + this.enrolledCourse.getCourseInfo());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String courseId = keyboard.nextLine();
        String courseName = keyboard.nextLine();
        String studentName = keyboard.nextLine();
        keyboard.close();

        Student s = new Student(studentName, new Course(courseId, courseName));
        s.displayEnrollment();
    }
}
