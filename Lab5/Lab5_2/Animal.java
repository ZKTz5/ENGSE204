package Lab5_2;
import java.util.Scanner;

public class Animal {
    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String inputName = kb.nextLine();
        int inputAge = kb.nextInt();

        Cat myCat = new Cat();

        myCat.name = inputName;
        myCat.age = inputAge;

        myCat.displayInfo();
        myCat.makeSound();

        kb.close();
    }
}