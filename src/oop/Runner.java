package oop;

public class Runner {

    public static void main(String[] args) {
        Dog firstDog = new Dog("Jupiter");
        Dog secondDog = new Dog("Jupiter", "Alsation", 20);

        System.out.println(firstDog.giveInfo());
        System.out.println(secondDog.giveInfo());

        System.out.println(Dog.animalType);
        System.out.println(firstDog.getAnimalType());
    }

}
