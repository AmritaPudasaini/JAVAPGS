import java.util.ArrayList;
import java.util.Arrays;

interface Calculate{
    void addition(int a, int b);
}

public class LambdaDemo{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        numbers.forEach(n-> System.out.println(n));

        Calculate calculate=(int a, int b)-> System.out.println(a+b);
        calculate.addition(3, 4);

    }
}