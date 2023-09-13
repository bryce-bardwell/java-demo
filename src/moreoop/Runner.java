package moreoop;

import java.util.ArrayList;

public class Runner {

    public static <List> void main(String[] args) {

        Car car = new Car("BMW", 4, 5);
        Car secondCar = new Car("Mercedes", 4, 4);
        Plane plane = new Plane("Boeing", 6, 600);
        Bicycle bicycle = new Bicycle("Marin", 2, 18);

        Garage garage = new Garage();

        garage.addVehicle(car);
        garage.addVehicle(secondCar);
        garage.addVehicle(plane);
        garage.addVehicle(bicycle);

        //System.out.println("\nBefore removing...");
        //garage.printGarage();
        //garage.getBills();

        //System.out.println("\n...After removing");
        garage.removeVehiclesByType("Car");
        //garage.printGarage();

        ArrayList<Flyable> flyables = new ArrayList<>();
        flyables.add(new Bird());
        flyables.add(new Plane("Boeing", 6, 500));

        Shed<Vehicle> shed = new Shed<>();
        shed.setVehicle(plane);

        shed.getVehicleInfo();
    }
}