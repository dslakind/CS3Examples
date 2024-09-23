/**
 * Lesson 2.2. Creating and Initializing Objects: Constructors
 * @version 09232024
 * @see AnimalTester.java
 * Example of constructor overloading.
 */
public class Animal
{
    // instance variable devlaration
    private String name;
    private String species;
    private String favFood;
    private int numLegs;
    private double weight;

    // constructor 1
    public Animal(String theName, String theSpecies, String theFood, int legs, double w)
    {
        name = theName;
        species = theSpecies;
        favFood = theFood;
        numLegs = legs;
        weight = w;
    }

    // constructor 2
    public Animal(String theName, String theSpecies)
    {
        name = theName;
        species = theSpecies;
        favFood = "Default Food" ;
        numLegs = 4;
        weight = 20.5;
    }

    // constructor 3 default
    public Animal()
    {
        name = "Default Animal";
        species = "Unknown";
        favFood = "Default Food" ;
        numLegs = 0;
        weight = 0.0;
    }

    // used when printing an Animal object. Comment out to print the reference number. 
    // @Override
    // public String toString() {
    //     return "Animal [name=" + name + ", species=" + species + ", favFood=" + favFood + ", numLegs=" + numLegs
    //             + ", weight=" + weight + "]";
    // }

    
}