public class Animal
{
    // instance variable devlaration
    private String name;
    private String species;
    private String favFood;
    private int numLegs;
    private double weight;

    // constructors
    public Animal(String theName, String theSpecies, String theFood, int legs, double w)
    {
        name = theName;
        species = theSpecies;
        favFood = theFood;
        numLegs = legs;
        weight = w;
    }

    public Animal(String theName, String theSpecies)
    {
        name = theName;
        species = theSpecies;
        favFood = "Default Food" ;
        numLegs = 4;
        weight = 20.5;
    }

    public Animal()
    {
        name = "Default Animal";
        species = "Unknown";
        favFood = "Default Food" ;
        numLegs = 0;
        weight = 0.0;
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", species=" + species + ", favFood=" + favFood + ", numLegs=" + numLegs
                + ", weight=" + weight + "]";
    }

    
}