package moreoop;

public class Car extends Vehicle {

    private int carGear;
    private int numberOfSeats;

    public Car(String make, int numberOfWheels, int numberOfSeats) {
        super(make, numberOfWheels);
        this.setNumberOfSeats(5);
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getCarGear() {
        return carGear;
    }

    public void setCarGear(int carGear) {
        this.carGear = carGear;
    }
}
