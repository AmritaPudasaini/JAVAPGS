import java.util.HashMap;

public class ProductStock{
    public static void main(String[] args) {
        HashMap<String, Integer> stock=new HashMap<>();
        stock.put ("Apple", 50);
        stock.put ("Mango", 40);
        stock.put ("Banana", 60);

        System.out.println("Initial stock:");
        System.out.println(stock);
        
    }
}