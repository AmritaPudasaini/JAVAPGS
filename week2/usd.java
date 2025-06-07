import java.util.Scanner;

public class usd {
    public static void main(String[] args) {
    
        final double conversionRate = 83.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();

        double inrAmount = usdAmount * conversionRate;

        System.out.println("Equivalent amount in INR: " + inrAmount);
        scanner.close();
    }
}
