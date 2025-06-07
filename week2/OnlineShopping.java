public class OnlineShopping {
    public static void main(String[] args) {
        double amount =350;
        double discount=0;
        double finalAmount;
        if (amount>500) {
            discount= amount * 0.20;
        }
        else if (amount>=200) {
            discount= amount * 0.50;
        }
        else {
            discount= 0;
        }
          finalAmount = amount-discount;
          System.out.println("Purchase Amount: $" + amount);
          System.out.println("Discount: $" + discount);
          System.out.println("Final Amount to Pay: $" + finalAmount);

    }
}