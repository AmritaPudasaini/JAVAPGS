import java.util.ArrayList;

public class JavaArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.set(0,100);
        numbers.add(1, 200);
        System.out.println(numbers.get(0));
        System.out.println(numbers.contains(100));


        for (int i = 10; i<=20; i++){
            numbers.add(i);
        }

        for (int i = 0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println(numbers);
    }
}