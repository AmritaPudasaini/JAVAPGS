class Book {
    String title;
    String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class PrintedBook extends Book {
    int pages;
    PrintedBook(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Pages: " + pages);
    }
}
class EBook extends Book {
    double fileSize;
    String format;
    EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("File Size (MB): " + fileSize);
        System.out.println("Format: " + format);
    }
}
public class LibraryRecords {
    public static void main(String[] args) {
        PrintedBook pBook = new PrintedBook("The Great Gatsby", "F. Scott Fitzgerald", 180);
        EBook eBook = new EBook("1984", "George Orwell", 1.2, "EPUB");
        System.out.println("Printed Book Details:");
        pBook.displayDetails();
        System.out.println("\nEBook Details:");
        eBook.displayDetails();
    }
}
