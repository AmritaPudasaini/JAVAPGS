public class CreateCar {
    public static void main(String[] args) {
        System.out.println("----- Car Details -----");
        Car car1 = new Car("Toyota", "Camry", 2022, 30000);
        Car car2 = new Car("Tesla", "Model S", 2023, 80000);
        car1.printDetails();
        car2.printDetails();
    }
}
class Car {
    private String brand;
    private String model;
    private int year;
    private double price;

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
        System.out.println("-----------------------------");
    }
}