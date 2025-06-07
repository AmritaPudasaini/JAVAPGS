public class TrafficLight {
    public static void main(String[] args) {
        String signal = "yellow";

        switch (signal) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Slow down");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid signal");
        }
    }
}