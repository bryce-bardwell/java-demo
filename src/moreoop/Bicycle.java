package moreoop;

public class Bicycle extends Vehicle {

    private int bikeGear;
    private int wheelRadius;

    public Bicycle(String make, int numberOfWheels, int wheelRadius) {
        super(make, numberOfWheels);
        this.setWheelRadius(wheelRadius);
    }

    public int getWheelRadius() {
        return wheelRadius;
    }

    public void setWheelRadius(int wheelRadius) {
        this.wheelRadius = wheelRadius;
    }

    public int getBikeGear() {
        return bikeGear;
    }

    public void setBikeGear(int bikeGear) {
        this.bikeGear = bikeGear;
    }

    public void wheelie() {
        System.out.println("Doing a wheelie");
    }

    @Override
    public double getBill() {
        return this.wheelRadius * 45;
    }
}