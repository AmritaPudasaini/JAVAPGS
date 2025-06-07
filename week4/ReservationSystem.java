import java.util.Scanner;
public class ReservationSystem {
    static String[] reservationArr = {"2025-01-21", "2025-01-23", "2025-01-24", "2025-01-29"};
    static String[] bookedArr = {"2025-01-21", "2025-01-23"};
    public static boolean checkAvailability(String date) {
        for (String bookedDate : bookedArr) {
            if (bookedDate.equals(date)) {
                return false;
            }
        }
        for (String reservationDate : reservationArr) {
            if (reservationDate.equals(date)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date to check availability (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        if (checkAvailability(date)) {
            System.out.println("Table is available on " + date);
        } else {
            System.out.println("Table is not available on " + date);
        }
    }
}
