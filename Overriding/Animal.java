package Overriding;

/**
 *
 * @author Rayhansyah
 */
public class Animal {
    public void displayInfo() {
        System.out.println("Ini adalah seekor hewan.");
    }
}

class Cat extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("Ini adalah seekor kucing.");
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("Ini adalah seekor anjing.");
    }
}

