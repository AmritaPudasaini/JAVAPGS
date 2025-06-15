abstract class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    abstract double calculateInterest();
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest: $" + calculateInterest());
    }
}
class SavingsAccount extends BankAccount {
    SavingsAccount(String accNo, double bal) {
        super(accNo, bal);
    }
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}
class CurrentAccount extends BankAccount {
    CurrentAccount(String accNo, double bal) {
        super(accNo, bal);
    }

    double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA101", 10000);
        BankAccount current = new CurrentAccount("CA202", 15000);

        savings.displayDetails();
        System.out.println();
        current.displayDetails();
    }
}
