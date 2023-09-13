package moreoop;

import java.util.ArrayList;

public class Shed<T extends Vehicle> {
    private T vehicle;

    public T getVehicle() {
        return vehicle;
    }

    public void setVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public void getVehicleInfo() {
        System.out.println("Currently in the shed: ");
        System.out.println(vehicle);
    }
}
