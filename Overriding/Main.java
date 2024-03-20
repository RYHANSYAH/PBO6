package Overriding;

/**
 *
 * @author Rayhansyah
 */
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.displayInfo();
        animal2.displayInfo(); 
    }
}

