import java.util.Scanner;

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalBill = 0.0;

        while (true) {
            System.out.print("Enter item price or type 'exit' to finish: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double price = Double.parseDouble(input);
                if (price < 0) {
                    System.out.println("Price cannot be negative. Try again.");
                } else {
                    totalBill += price;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
            }
        }

        System.out.printf("Total bill amount: $%.2f%n", totalBill);
        scanner.close();
    }
}
