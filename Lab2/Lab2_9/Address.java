package Lab2.Lab2_9;
import java.util.Scanner;

class Address {
    private String street;
    private String city;
    private String zipCode;

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getFullAddress() {
        return this.street + ", " + this.city + ", " + this.zipCode;
    }
}

class Student {
    private String name;
    private Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address.getFullAddress());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.nextLine();
        String street = keyboard.nextLine();
        String city = keyboard.nextLine();
        String zipCode = keyboard.nextLine();
        keyboard.close();

        Address a = new Address(street, city, zipCode);
        Student s = new Student(name, a);
        s.displayInfo();
    }
}