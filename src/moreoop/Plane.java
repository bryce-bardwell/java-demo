package moreoop;

public class Plane extends Vehicle {

    private boolean gearDown;
    private int numberOfSeats;

    public Plane(String make, int numberOfWheels, int numberOfSeats) {
        super(make, numberOfWheels);
        this.setNumberOfSeats(600);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean isGearDown() {
        return gearDown;
    }

    public void setGearDown(boolean gearDown) {
        this.gearDown = gearDown;
    }

    @Override
    public double getBill() {
        return this.numberOfSeats * 500;
    }
}
