package Lab3.Lab3_7;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String department;

    public Employee(String employeeId, String department) {
        if (employeeId == null || employeeId.isEmpty()) {
            throw new IllegalArgumentException("Error : Employee ID cannot be null or empty");
        } else {
            this.employeeId = employeeId;
            this.department = department;
        }
    }
    
    public String getEmployeeID() {
        return this.employeeId;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String newDepartment) {
        if (newDepartment == null || newDepartment.isEmpty()) {
            throw new IllegalArgumentException("Error : Department cannot be null or empty");
        } else {
            this.department = newDepartment;
        }
    }
}

class Main {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            String employeeId = keyboard.nextLine();
            String department = keyboard.nextLine();
            String newDepartment = keyboard.nextLine();

            Employee emp = new Employee(employeeId, department);
            emp.setDepartment(newDepartment);

            System.out.println(emp.getEmployeeID());
            System.out.println(emp.getDepartment());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
