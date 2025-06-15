abstract class PaymentMethod {
    String customerName;
    PaymentMethod(String customerName) {
        this.customerName = customerName;
    }
    abstract void processPayment(double amount);
}
class CreditCard extends PaymentMethod {
    CreditCard(String name) {
        super(name);
    }

    void processPayment(double amount) {
        System.out.println(customerName + " paid $" + amount + " using Credit Card.");
    }
}
class PayPal extends PaymentMethod {
    PayPal(String name) {
        super(name);
    }
    void processPayment(double amount) {
        System.out.println(customerName + " paid $" + amount + " using PayPal.");
    }
}
class UPI extends PaymentMethod {
    UPI(String name) {
        super(name);
    }

    void processPayment(double amount) {
        System.out.println(customerName + " paid $" + amount + " using UPI.");
    }
}
public class PaymentProcessing {
    public static void main(String[] args) {
        PaymentMethod cc = new CreditCard("Amrita");
        PaymentMethod paypal = new PayPal("Anish");
        PaymentMethod upi = new UPI("Sita");

        cc.processPayment(500.0);
        paypal.processPayment(350.0);
        upi.processPayment(200.0);
    }
}