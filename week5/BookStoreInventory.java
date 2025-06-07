import java.util.Scanner;
public class BookStoreInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[2];
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");

            System.out.print("Title: ");
            String title = scanner.nextLine();

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Price: ");
            double price = Double.parseDouble(scanner.nextLine());

            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            books[i] = new Book(title, author, price, isbn);
            System.out.println();
        }
        System.out.println("Book Details:");
        for (Book book : books) {
            book.displayDetails();
            System.out.println();
        }
        scanner.close();
    }
}
class Book {
    private String title, author, isbn;
    private double price;
    public Book(String title, String author, double price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("ISBN: " + isbn);
    }
}
