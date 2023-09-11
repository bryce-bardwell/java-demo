package oop;

public class Runner {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Jupiter");
        dog.setAge(4);
        dog.setBreed("Alsation");

        System.out.println(dog.giveInfo());
    }

}
