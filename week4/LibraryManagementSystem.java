import java.util.Scanner;
public class LibraryManagementSystem {
    static String[] books = {"Java Basics", "Python Fundamentals", "Data Structures", "Algorithms", "Operating Systems"};
    static boolean[] isBorrowed = {false, false, false, false, false};
    public static boolean checkAvailability(String bookTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(bookTitle) && !isBorrowed[i]) {
                return true;
            }
        }
        return false;
    }
    public static void borrowBook(String bookTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].equalsIgnoreCase(bookTitle)) {
                if (!isBorrowed[i]) {
                    isBorrowed[i] = true;
                    System.out.println("You have successfully borrowed \"" + books[i] + "\".");
                    return;
                } else {
                    System.out.println("Sorry, \"" + books[i] + "\" is already borrowed.");
                    return;
                }
            }
        }
        System.out.println("Book not found in the library.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Library Menu ===");
            System.out.println("1. Check Book Availability");
            System.out.println("2. Borrow Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter book title to check availability: ");
                    String titleCheck = scanner.nextLine();
                    if (checkAvailability(titleCheck)) {
                        System.out.println("\"" + titleCheck + "\" is available.");
                    } else {
                        System.out.println("\"" + titleCheck + "\" is not available.");
                    }
                    break;
                case 2:
                    System.out.print("Enter book title to borrow: ");
                    String titleBorrow = scanner.nextLine();
                    borrowBook(titleBorrow);
                    break;
                case 3:
                    System.out.println("Thank you for using the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }
}
