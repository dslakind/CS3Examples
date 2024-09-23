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
