import java.util.*;

public class NewVariable{
    public static void main(String[] args) {
        // datatype variableName = value
        int newValue = 10;
        float price=7.6f;
        double newPrices=5.2;
        long largeValue=23434567L;
        char letter='A';
        String name="John Doe";
        
        System.out.println(newValue);
        System.out.println(price);
        System.out.println(newPrices);
        System.out.println(largeValue);
        System.out.println(letter);
        System.out.println(name);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputValue = sc.nextInt();
        System.out.println("Input value:"+inputValue);
    }
}