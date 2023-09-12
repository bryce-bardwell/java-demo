package moreoop;

public class Runner {

    public static void main(String[] args) {

        Car car = new Car("BMW", 4);
        Car threeWheeler = new Car("Campagna", 3);

        Plane plane = new Plane("Boeing", 6);

        Bicycle bicycle = new Bicycle("Marin", 2);

        threeWheeler.setCarGear(4);
        plane.setGearDown(true);
        bicycle.setBikeGear(3);

        car.giveInfo();
        plane.giveInfo();
        bicycle.giveInfo();
    }
}
