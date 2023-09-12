package moreoop;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private int idCount;
    private List<Vehicle> vehicles = new ArrayList<>();

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

    public void emptyGarage() {
        this.vehicles = new ArrayList<>();
    }

    public double getBills() {
        double totalBill = 0;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Getting bill for: " + vehicle);
            totalBill += bill(vehicle);
        }

        return totalBill;
    }

    public double bill(Vehicle vehicle) {
        return vehicle.getBill();
    }

    public void removeVehiclesByType(String type) {
        ArrayList<Vehicle> vehiclesToRemove = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getClass().getSimpleName().equals(type)) {
                vehiclesToRemove.add(vehicle);
            }
        }

        for (Vehicle vehicle : vehiclesToRemove) {
            removeVehicle(vehicle);
        }
    }
}
