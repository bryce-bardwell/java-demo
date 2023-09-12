package moreoop;

public class Vehicle {

    private final String make;
    private final int numberOfWheels;
    private int ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Vehicle(String make, int numberOfWheels) {
        this.make = make;
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", numberOfWheels=" + numberOfWheels +
                ", ID=" + ID +
                '}';
    }

    public void move() {
        System.out.println(this.make + " Accelerating");
    }

    public void stop() {
        System.out.println(this.make + " Breaking");
    }

    public void giveInfo() {
        System.out.println("This is a " + make + " with " + numberOfWheels + " wheels.");
    }

    public double getBill() {
        return 0.0;
    }
}
