abstract class Discount {
    abstract double applyDiscount(double totalAmount);
}
class FestivalDiscount extends Discount {
    double applyDiscount(double totalAmount) {
        return totalAmount * 0.20; // 20% off
    }
}

class SeasonalDiscount extends Discount {
    double applyDiscount(double totalAmount) {
        return totalAmount * 0.15; // 15% off
    }
}

class CouponDiscount extends Discount {
    double applyDiscount(double totalAmount) {
        return totalAmount >= 500 ? 50 : 0; // Flat $50 off on orders >= $500
    }
}
public class DiscountSystem {
    public static void main(String[] args) {
        double total = 600;

        Discount fd = new FestivalDiscount();
        Discount sd = new SeasonalDiscount();
        Discount cd = new CouponDiscount();

        System.out.println("Festival Discount: $" + fd.applyDiscount(total));
        System.out.println("Seasonal Discount: $" + sd.applyDiscount(total));
        System.out.println("Coupon Discount: $" + cd.applyDiscount(total));
    }
}
