package moreoop;

public class Plane extends Vehicle {

    private boolean gearDown;

    public boolean isGearDown() {
        return gearDown;
    }

    public void setGearDown(boolean gearDown) {
        this.gearDown = gearDown;
    }

    public Plane(String make, int numberOfWheels) {
        super(make, numberOfWheels);
    }
}
