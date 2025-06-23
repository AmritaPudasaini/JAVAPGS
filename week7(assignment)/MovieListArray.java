import java.util.ArrayList;
import java.util.Scanner;
public class MovieListArray {
    static ArrayList<String> playlist = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Movie Playlist Menu ---");
            System.out.println("1. Add Movie to Playlist");
            System.out.println("2. Insert Movie at Specific Index");
            System.out.println("3. Remove Movie by Name");
            System.out.println("4. Show Playlist");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: addMovie(); break;
                case 2: insertMovie(); break;
                case 3: removeMovie(); break;
                case 4: showPlaylist(); break;
                case 5: System.out.println("Exiting..."); break;
                default: System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }
    static void addMovie() {
        System.out.print("Enter movie name: ");
        String movie = scanner.nextLine();
        playlist.add(movie);
        System.out.println("Movie added to playlist.");
    }
    static void insertMovie() {
        System.out.print("Enter movie name: ");
        String movie = scanner.nextLine();
        System.out.print("Enter index (starting from 0): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index <= playlist.size()) {
            playlist.add(index, movie);
            System.out.println("Movie inserted at index " + index + ".");
        } else {
            System.out.println("Invalid index.");
        }
    }
    static void removeMovie() {
        System.out.print("Enter movie name to remove: ");
        String movie = scanner.nextLine();
        if (playlist.remove(movie)) {
            System.out.println("Movie removed from playlist.");
        } else {
            System.out.println("Movie not found.");
        }
    }
    static void showPlaylist() {
        System.out.println("\n--- Current Playlist ---");
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty.");
        } else {
            for (int i = 0; i < playlist.size(); i++) {
                System.out.println((i + 1) + ". " + playlist.get(i));
            }
        }
    }
}
