import java.util.Set;

class Animals{
    private String species;
    int age;
    float weight;
    protected String color;

    public Animals(String species, int age, float weight, String color) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void displayAnimals(){
        System.out.println(age +" years & "+ weight +" kg "+ species + " in "+ color);
    }
}

class Dog extends Animals{

    private String name;
    private String owner;

    public Dog(String species, int age, float weight, String color, String name, String owner) {
        super(species, age, weight, color);
        this.name = name;
        this.owner = owner;
    }

    public void displayDog(){
        System.out.println(name+" owned by "+owner);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Mammal", 5, 20.5f, "Black", "Jacky", "Akhil");
        dog.displayAnimals();
        dog.displayDog();
    }
}
