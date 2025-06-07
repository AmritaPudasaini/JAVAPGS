import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Time (T) in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter Rate of interest (R): ");
        double rate = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + simpleInterest);

        scanner.close();
    }
}
