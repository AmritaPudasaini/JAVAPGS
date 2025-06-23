import java.util.LinkedList;
import java.util.Scanner;

public class RecentActivity {
    static final int MAX_SIZE = 5;
    static LinkedList<String> activities = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Activity Tracker ---");
            System.out.println("1. Add Activity");
            System.out.println("2. Show Recent Activities");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1: addActivity(); break;
                case 2: showActivities(); break;
                case 3: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }
    static void addActivity() {
        System.out.print("Enter activity: ");
        String activity = scanner.nextLine();
        if (activities.size() == MAX_SIZE) {
            activities.removeFirst(); // Remove oldest
        }
        activities.addLast(activity); // Add newest
        System.out.println("Activity added.");
    }
    static void showActivities() {
        System.out.println("\n--- Last 5 Activities ---");
        for (String act : activities) {
            System.out.println(act);
        }
    }
}
