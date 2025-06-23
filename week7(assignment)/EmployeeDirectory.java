import java.util.HashMap;
import java.util.Scanner;
public class EmployeeDirectory {
    public static void main(String[] args) {
        HashMap<Integer, String> directory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- Employee Directory ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Look Up Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter Employee ID: ");
                int id = scanner.nextInt();
                scanner.nextLine(); // consume newline
                System.out.print("Enter Employee Name: ");
                String name = scanner.nextLine();
                directory.put(id, name);
                System.out.println("Employee added.");
            } else if (choice == 2) {
                System.out.print("Enter Employee ID to search: ");
                int id = scanner.nextInt();
                if (directory.containsKey(id)) {
                    System.out.println("Employee Name: " + directory.get(id));
                } else {
                    System.out.println("Employee not found.");
                }
            } else if (choice == 3) {
                System.out.println("\n--- Employee List ---");
                for (Integer id : directory.keySet()) {
                    System.out.println("ID: " + id + " → " + directory.get(id));
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");

            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}
