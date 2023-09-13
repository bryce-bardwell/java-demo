package moreoop;

public class Bird extends Animal implements Flyable {

    @Override
    public void eatFood() {
        System.out.println("Yum yum yum");
    }

    @Override
    public void fly() {
        System.out.println("flap flap flap");
    }
}