import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 5000.0;

        while (balance > 0) {
            System.out.println("Current Balance: $" + balance);
            System.out.println("Withdrawal amount: ");
            double withdrawamount = scanner.nextDouble();

            if (withdrawamount <= balance){
                balance-=withdrawamount;
                System.out.println("Withdrawal successful. Remaining balance: $" + balance);
            } else {
                System.out.println("Error: Insufficient balance. Try smaller amount.");
            }

            System.out.println();
        }

        System.out.println("Your account balance is $0. No further withdrawal allowed");
        scanner.close();

    }
}