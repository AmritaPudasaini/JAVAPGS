import java.util.ArrayList;
import java.util.Arrays;

public class LambdaDemo{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.forEach(n-> System.out.println(n));
    }
}