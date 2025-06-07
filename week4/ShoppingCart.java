public class ShoppingCart {
    public static double calculateTotal(double[] prices) {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice += price;
        }

        if (totalPrice > 1000) {
            totalPrice *= 0.80;  // 20% discount
        } else if (totalPrice > 600) {
            totalPrice *= 0.90;  // 10% discount
        }

        return totalPrice;
    }
    public static void main(String[] args) {
        double[] itemPrices = {250.0, 350.0, 200.0, 300.0};
        double finalTotal = calculateTotal(itemPrices);
        System.out.printf("Total cost after discount: %.2f%n", finalTotal);
    }
}
