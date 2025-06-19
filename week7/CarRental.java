import java.util.Scanner;

class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class CarRental {

    public static void checkAge(int age) throws AgeRestrictionException {
        if (age < 21) {
            throw new AgeRestrictionException("You must be at least 21 years old to rent a car.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);
            System.out.println("You are eligible to rent a car.");
        } catch (AgeRestrictionException e) {
            System.out.println("Rental Denied: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid age.");
        } finally {
            scanner.close();
        }
    }
}