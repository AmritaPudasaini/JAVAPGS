import java.util.Scanner;
class Book {
    String title;
    String author;
    boolean isAvailable;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    void lendBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("The book \"" + title + "\" has been lent.");
        } else {
            System.out.println("The book \"" + title + "\" is already borrowed.");
        }
    }
    void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("The book \"" + title + "\" has been returned.");
        } else {
            System.out.println("The book \"" + title + "\" was not borrowed.");
        }
    }
    void displayStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book("To Kill a Mockingbird", "Harper Lee");
        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Lend Book");
            System.out.println("2. Return Book");
            System.out.println("3. View Book Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    book.lendBook();
                    break;
                case 2:
                    book.returnBook();
                    break;
                case 3:
                    book.displayStatus();
                    break;
                case 4:
                    System.out.println("Exiting Library System.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
