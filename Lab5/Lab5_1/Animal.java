package Lab5_1;
import java.util.Scanner;

public class Animal {
    protected String name;
    protected int age;

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String inputName = kb.nextLine();
        int inputAge = kb.nextInt();

        Dog myDog = new Dog();

        myDog.name = inputName;
        myDog.age = inputAge;

        myDog.makeSound();
        myDog.displayInfo();

        kb.close();
    }
}