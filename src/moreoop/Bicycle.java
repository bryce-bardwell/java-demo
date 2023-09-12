package moreoop;

public class Bicycle extends Vehicle {

    public Bicycle(String make, int numberOfWheels) {
        super(make, numberOfWheels);
    }

    private int bikeGear;

    public int getBikeGear() {
        return bikeGear;
    }

    public void setBikeGear(int bikeGear) {
        this.bikeGear = bikeGear;
    }

    public void wheelie() {
        System.out.println("Doing a wheelie");
    }
}