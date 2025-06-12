import java.util.ArrayList;

public class JavaArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);

        for (int i = 10; i<=20; i++){
            numbers.add(i);
        }
        System.out.println(numbers);
    }
}