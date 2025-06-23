import java.util.HashMap;
import java.util.Scanner;
public class StoreStockTracker {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n--- Store Inventory Menu ---");
            System.out.println("1. Add New Product");
            System.out.println("2. Update Stock Quantity");
            System.out.println("3. View Product Stock");
            System.out.println("4. Remove Product");
            System.out.println("5. View All Products");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            if (choice == 1) {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                stock.put(name, quantity);
                System.out.println("Product added.");
            } else if (choice == 2) {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                if (stock.containsKey(name)) {
                    System.out.print("Enter quantity to add/remove (negative to decrease): ");
                    int change = scanner.nextInt();
                    int updatedQty = stock.get(name) + change;
                    if (updatedQty >= 0) {
                        stock.put(name, updatedQty);
                        System.out.println("Stock updated.");
                    } else {
                        System.out.println("Stock can't be negative. Operation cancelled.");
                    }
                } else {
                    System.out.println("Product not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                if (stock.containsKey(name)) {
                    System.out.println(name + " stock: " + stock.get(name));
                } else {
                    System.out.println("Product not found.");
                }
            } else if (choice == 4) {
                System.out.print("Enter product name to remove: ");
                String name = scanner.nextLine();
                if (stock.remove(name) != null) {
                    System.out.println("Product removed.");
                } else {
                    System.out.println("Product not found.");
                }
            } else if (choice == 5) {
                System.out.println("\n--- Product Stock List ---");
                if (stock.isEmpty()) {
                    System.out.println("No products in stock.");
                } else {
                    for (String product : stock.keySet()) {
                        System.out.println(product + " → " + stock.get(product));
                    }
                }

            } else if (choice == 6) {
                System.out.println("Exiting...");

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}
