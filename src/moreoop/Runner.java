package moreoop;

public class Runner {

    public static void main(String[] args) {

        Car car = new Car("BMW", 4);
        Plane plane = new Plane("Boeing", 6);
        Bicycle bicycle = new Bicycle("Marin", 2);

        Garage garage = new Garage();

        garage.addVehicle(car);
        garage.addVehicle(plane);
        garage.addVehicle(bicycle);

        garage.printGarage();

        System.out.println();
        garage.removeVehicleByID(1);

        garage.printGarage();
    }
}
