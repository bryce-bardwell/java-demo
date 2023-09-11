package oop;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        //Dog firstDog = new Dog("Jupiter");
        //Dog secondDog = new Dog("Jupiter", "Alsatian", 20);

        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Buster"));
        dogs.add(new Dog("Chopper"));
        dogs.add(new Dog("Boxer"));

        //traditional for loop
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println(dogs.get(i).getName());
        }

        // enhanced for loop
        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }
    }
}