package myanimals;

public class Animal {
    public static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
        System.out.println("A new animal has been created! Total animals: " + numOfAnimals);
    }
}