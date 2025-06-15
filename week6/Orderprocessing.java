class Order {
    int orderId;
    String customerName;
    double totalAmount;

    Order(int orderId, String customerName, double totalAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }
    double calculateDiscount() {
        if (totalAmount > 1000) {
            return totalAmount * 0.10;
        } else if (totalAmount > 500) {
            return totalAmount * 0.05;
        } else {
            return 0;
        }
    }
    void displayFinalAmount() {
        double discount = calculateDiscount();
        double finalAmount = totalAmount - discount;
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customerName);
        System.out.println("Original Amount: $" + totalAmount);
        System.out.println("Discount: $" + discount);
        System.out.println("Final Amount: $" + finalAmount);
    }
}
public class Orderprocessing {
    public static void main(String[] args) {
        Order order1 = new Order(1001, "Amrita", 1200);
        Order order2 = new Order(1002, "Anish", 750);
        Order order3 = new Order(1003, "Sita", 400);

        order1.displayFinalAmount();
        System.out.println();
        order2.displayFinalAmount();
        System.out.println();
        order3.displayFinalAmount();
    }
}
