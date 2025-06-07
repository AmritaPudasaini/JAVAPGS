interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Car started");
    }
    @Override
    public void stop(){
        System.out.println("Car stopped.");
    }
}

class Bike implements Vehicle{
    @Override
    public void start(){
        System.out.println("Bike started");
    }
    @Override
    public void stop(){
        System.out.println("Bike stopped.");
    }
}

public class VehicleManagementSystem{
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}