package moreoop;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private int idCount;
    private final List<Vehicle> vehicles = new ArrayList<>();

    public Garage() {
        this.idCount = 0;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicle.setID(idCount);
        idCount++;
        vehicles.add(vehicle);
    }

    public boolean removeVehicle(Vehicle vehicle) {
        return vehicles.remove(vehicle);
    }

    public boolean removeVehicleByID(int id) {
        Vehicle vehicleToRemove = null;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getID() == id) {
                vehicleToRemove = vehicle;
            }
        }

        return removeVehicle(vehicleToRemove);
    }

    public void printGarage() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }
}
