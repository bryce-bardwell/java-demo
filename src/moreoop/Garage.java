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

    public void getBills() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Getting bill for: " + vehicle);
            System.out.println("£" + bill(vehicle));
        }
    }

    public double bill(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            return ((Car) vehicle).getNumberOfSeats() * 500;
        } else if (vehicle instanceof Bicycle) {
            return ((Bicycle) vehicle).getWheelRadius() * 45;
        } else {
            return ((Plane) vehicle).getNumberOfSeats() * 500;
        }
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
