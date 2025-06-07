import java.util.Scanner;

public class ECommerceProductSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int productId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = Integer.parseInt(scanner.nextLine());
        Product product = new Product(productId, name, price, stockQuantity);

        System.out.print("Enter quantity sold: ");
        int quantitySold = Integer.parseInt(scanner.nextLine());
        product.updateStock(quantitySold);

        System.out.println("\nUpdated Product Details:");
        System.out.println("Product ID: " + product.getProductId());
        System.out.println("Name: " + product.getName());
        System.out.println("Price: $" + product.getPrice());
        System.out.println("Stock Quantity: " + product.getStockQuantity());

        scanner.close();
    }
}
class Product {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public void updateStock(int quantitySold) {
        if (quantitySold > 0 && quantitySold <= stockQuantity) {
            stockQuantity -= quantitySold;
            System.out.println("Stock updated successfully. Sold " + quantitySold + " units.");
        } else {
            System.out.println("Invalid quantity or insufficient stock.");
        }
    }
    public int getProductId() {
        return productId;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
}
