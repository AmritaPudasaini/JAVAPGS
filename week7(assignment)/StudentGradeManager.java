import java.util.HashMap;
import java.util.Scanner;
public class StudentGradeManager {
    public static void main(String[] args) {
        HashMap<String, Double> grades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n--- Student Grade Management ---");
            System.out.println("1. Add or Update Grade");
            System.out.println("2. View Grade by Name");
            System.out.println("3. Display All Grades");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                System.out.print("Enter grade: ");
                double grade = scanner.nextDouble();
                grades.put(name, grade);
                System.out.println("Grade saved.");
            } else if (choice == 2) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                if (grades.containsKey(name)) {
                    System.out.println(name + "'s grade: " + grades.get(name));
                } else {
                    System.out.println("Student not found.");
                }
            } else if (choice == 3) {
                System.out.println("\n--- All Student Grades ---");
                for (String student : grades.keySet()) {
                    System.out.println(student + " → " + grades.get(student));
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
