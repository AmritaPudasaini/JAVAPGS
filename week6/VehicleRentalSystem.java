abstract class Vehicle {
    String model;
    int manufactureYear;
    Vehicle(String model, int manufactureYear) {
        this.model = model;
        this.manufactureYear = manufactureYear;
    }
    abstract int calculateRent(int days);
    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Manufacture Year: " + manufactureYear);
    }
}
class Car extends Vehicle {
    Car(String model, int year) {
        super(model, year);
    }
    int calculateRent(int days) {
        return days * 100;
    }
}
class Bike extends Vehicle {
    Bike(String model, int year) {
        super(model, year);
    }
    int calculateRent(int days) {
        return days * 20;
    }
}
class Truck extends Vehicle {
    Truck(String model, int year) {
        super(model, year);
    }
    int calculateRent(int days) {
        return days * 500;
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Corolla", 2020);
        Vehicle bike = new Bike("Yamaha FZ", 2022);
        Vehicle truck = new Truck("Tata Hauler", 2019);
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println("Rent for 3 days: $" + car.calculateRent(3));

        System.out.println("\nBike Details:");
        bike.displayDetails();
        System.out.println("Rent for 5 days: $" + bike.calculateRent(5));
        System.out.println("\nTruck Details:");
        truck.displayDetails();
        System.out.println("Rent for 2 days: $" + truck.calculateRent(2));
    }
}
