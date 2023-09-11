package oop;

public class Dog {

    private String name;
    private String breed;
    private int age;
    public static String animalType = "Canine";

    public static String getAnimalType() {
        return animalType;
    }

    public static void setAnimalType(String animalType) {
        Dog.animalType = animalType;
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("Woof! Dog made named " + name);
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        System.out.println("Woof! Dog made named " + name + ", of breed" + breed + " and " + age + " years old");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "My name is " + this.name + ", I am a " + this.breed + ", and I am " + this.age + " years old!";
    }
}
