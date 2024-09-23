/**
 * Lesson 2.2. Creating and Initializing Objects: Constructors
 * @version 09232024
 * @author: Mr. Lakind
 * @see Animal.java
 * Example of constructor overloading.
 */
public class AnimalTester {
    public static void main(String[] args) {
        Animal george = new Animal("George", "Monkey", "Bananas", 2, 50);
        System.out.println(george);

        Animal animal2 = new Animal("Rover", "Dog");
        System.out.println(animal2);

        Animal animal3 = new Animal();
        System.out.println(animal3);
    }
}
