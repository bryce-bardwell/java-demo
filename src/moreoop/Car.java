package moreoop;

public class Car extends Vehicle {

    private int carGear;

    public Car(String make, int numberOfWheels) {
        super(make, numberOfWheels);
    }

    public int getCarGear() {
        return carGear;
    }

    public void setCarGear(int carGear) {
        this.carGear = carGear;
    }
}
