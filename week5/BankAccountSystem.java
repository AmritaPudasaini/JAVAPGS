import java.util.Scanner;
public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Account Number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Account Holder Name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Initial Balance: ");
        double balance = Double.parseDouble(scanner.nextLine());

        BankAccount account = new BankAccount(accountNumber, accountHolder, balance);

        System.out.print("Deposit Amount: ");
        double deposit = Double.parseDouble(scanner.nextLine());
        account.deposit(deposit);

        System.out.print("Withdraw Amount: ");
        double withdraw = Double.parseDouble(scanner.nextLine());
        account.withdraw(withdraw);

        System.out.println("Final Balance: $" + account.getBalance());

        scanner.close();
    }
}
class BankAccount {
    private String accountNumber, accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public double getBalance() {
        return balance;
    }
}
