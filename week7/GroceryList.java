import java.util.ArrayList;
import java.util.Scanner;

public class GroceryList {
    static ArrayList<String> groceryList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;

        System.out.println("Welcome to Grocery List Manager!");

        do {
            System.out.println("\n1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                addItem();
            } else if (choice == 2) {
                removeItem();
            } else if (choice == 3) {
                displayList();
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);
    }
    public static void addItem() {
        System.out.println("Enter the item to add: ");
        String item = scanner.nextLine();
        groceryList.add(item);
        System.out.println(item + " added.");
    }
    public static void removeItem() {
        System.out.print("Enter item to remove: ");
        String item = scanner.nextLine();
        if (groceryList.remove(item)) {
            System.out.println(item + " removed.");
        } else {
            System.out.println(item + " not found.");
        }
    }
    public static void displayList() {
        if (groceryList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Grocery List:");
            for (int i = 0; i < groceryList.size(); i++) {
                System.out.println((i + 1) + ". " + groceryList.get(i));
            }
        }
    }
}