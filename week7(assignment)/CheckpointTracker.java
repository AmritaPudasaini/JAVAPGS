import java.util.LinkedList;
import java.util.Scanner;
public class CheckpointTracker {
    private LinkedList<String> checkpoints = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CheckpointTracker tracker = new CheckpointTracker();
        tracker.run();
    }
    public void run() {
        int choice;
        do {
            System.out.println("\n--- Package Checkpoint Menu ---");
            System.out.println("1. Add New Checkpoint (End)");
            System.out.println("2. Add Correction Checkpoint (Beginning)");
            System.out.println("3. Remove First Checkpoint");
            System.out.println("4. Remove Last Checkpoint");
            System.out.println("5. Show All Checkpoints");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1 -> addCheckpointEnd();
                case 2 -> addCorrectionStart();
                case 3 -> removeFirstCheckpoint();
                case 4 -> removeLastCheckpoint();
                case 5 -> showCheckpoints();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }
    private void addCheckpointEnd() {
        System.out.print("Enter checkpoint name: ");
        String checkpoint = scanner.nextLine();
        checkpoints.addLast(checkpoint);
        System.out.println("Checkpoint added at the end.");
    }
    private void addCorrectionStart() {
        System.out.print("Enter correction checkpoint name: ");
        String checkpoint = scanner.nextLine();
        checkpoints.addFirst(checkpoint);
        System.out.println("Correction added at the beginning.");
    }
    private void removeFirstCheckpoint() {
        if (!checkpoints.isEmpty()) {
            System.out.println("Removed: " + checkpoints.removeFirst());
        } else {
            System.out.println("No checkpoints to remove.");
        }
    }
    private void removeLastCheckpoint() {
        if (!checkpoints.isEmpty()) {
            System.out.println("Removed: " + checkpoints.removeLast());
        } else {
            System.out.println("No checkpoints to remove.");
        }
    }
    private void showCheckpoints() {
        System.out.println("\n--- Current Checkpoints ---");
        if (checkpoints.isEmpty()) {
            System.out.println("No checkpoints recorded.");
        } else {
            int i = 1;
            for (String checkpoint : checkpoints) {
                System.out.println(i++ + ". " + checkpoint);
            }
        }
    }
}
