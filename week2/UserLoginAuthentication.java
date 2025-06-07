import java.util.Scanner;

public class UserLoginAuthentication {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(correctUsername)) {
            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Username not found.");
        }

        scanner.close();
    }
}
