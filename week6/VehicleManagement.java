class Vehicle {
    String brandName;
    int maxSpeed;

    Vehicle(String brandName, int maxSpeed) {
        this.brandName = brandName;
        this.maxSpeed = maxSpeed;
    }
    void displayInfo() {
        System.out.println("Brand: " + brandName);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}
class Car extends Vehicle {
    int numDoors;

    Car(String brandName, int maxSpeed, int numDoors) {
        super(brandName, maxSpeed);
        this.numDoors = numDoors;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Doors: " + numDoors);
    }
}
class Bike extends Vehicle {
    String handlebarType;

    Bike(String brandName, int maxSpeed, String handlebarType) {
        super(brandName, maxSpeed);
        this.handlebarType = handlebarType;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Handlebar Type: " + handlebarType);
    }
}
public class VehicleManagement {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 4);
        Bike bike = new Bike("Yamaha", 150, "Clip-on");
        System.out.println("Car Details:");
        car.displayInfo();
        System.out.println("\nBike Details:");
        bike.displayInfo();
    }
}