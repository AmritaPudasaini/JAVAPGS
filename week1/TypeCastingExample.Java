public class TypeCastingExample {
    public static void main(String[] args) {
        int clothPrice=1000;
        int vat = 13;
        double totalPrice = clothPrice + vat; // Implicit type casting

        double newClothPrice = 1500.45;
        int newVat = 13;
        int finalPrice=(int) newClothPrice + newVat; // Explicit type casting
        System.out.println("finalPrice=" + finalPrice);

    }
}