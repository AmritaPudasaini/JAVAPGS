abstract class SmartDevice {
    String deviceName;
    SmartDevice(String deviceName) {
        this.deviceName = deviceName;
    }
    abstract void turnOn();
    abstract void turnOff();
}
class SmartLight extends SmartDevice {
    SmartLight(String name) {
        super(name);
    }
    void turnOn() {
        System.out.println(deviceName + " is now ON with warm lighting.");
    }
    void turnOff() {
        System.out.println(deviceName + " is now OFF.");
    }
}
class SmartThermostat extends SmartDevice {
    SmartThermostat(String name) {
        super(name);
    }
    void turnOn() {
        System.out.println(deviceName + " is ON and adjusting temperature to 22°C.");
    }
    void turnOff() {
        System.out.println(deviceName + " is OFF. Temperature control disabled.");
    }
}
class SmartDoorLock extends SmartDevice {
    SmartDoorLock(String name) {
        super(name);
    }void turnOn() {
        System.out.println(deviceName + " is LOCKED.");
    }void turnOff() {
        System.out.println(deviceName + " is UNLOCKED.");
    }
}
public class SmartHome {
    public static void main(String[] args) {
        SmartDevice light = new SmartLight("Living Room Light");
        SmartDevice thermostat = new SmartThermostat("Nest Thermostat");
        SmartDevice doorLock = new SmartDoorLock("Front Door Lock");
        light.turnOn();
        light.turnOff();
        System.out.println();
        thermostat.turnOn();
        thermostat.turnOff();
        System.out.println();
        doorLock.turnOn();
        doorLock.turnOff();
    }
}
