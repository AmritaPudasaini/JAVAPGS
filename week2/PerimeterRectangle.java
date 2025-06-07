import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of a rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of a rectangle: ");
        double breadth = scanner.nextDouble();

        double perimeter = 2 * (length + breadth);
        
        System.out.println("Perimeter of a rectangle is: " + perimeter);
    }
}