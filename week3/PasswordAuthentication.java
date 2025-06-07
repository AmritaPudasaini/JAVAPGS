import java.util.Scanner;

public class PasswordAuthentication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "1234";
        int attempts = 0;
        boolean accessGranted = false;

        while (attempts < 3) {
            System.out.println("Enter password: ");
            String input = scanner.nextLine();

            if (input.equals(correctPassword)){
                System.out.println("Access Granted.");
                accessGranted = true;
                break;
            } else{
                System.out.println("Incorrect Password.");
                attempts++;
            }
        }

        if (!accessGranted){
            System.out.println("Access Locked");
        }
        scanner.close();
    }
}