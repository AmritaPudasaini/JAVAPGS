import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;



public class JavaLinkedList {
    public static void main(String[] args) {
        ArrayList<String> places=new ArrayList<>(Arrays.asList("ktm", "pokhara", "lalitpur"));
        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(2,3,4,5));
        // places.remove("ktm");
        // nums.remove(Integer.valueOf(2));
        Collections.sort(places);
        Collections.sort(nums, Collections.reverseOrder());

        System.out.println(places);
        System.out.println(nums);

        // Node n1=new Node();
        // Node n2=new Node();
        // n1.data=10;
        // n2.data=20;
        // n1.next=n2;
        // n2.next=null;

        LinkedList<String> animals=new LinkedList<>();
        LinkedList<String> removeAnimals=new LinkedList<>(Arrays.asList("cat", "dog"));
        LinkedList<Integer> Integer=new LinkedList<>(Arrays.asList(1,2,3,4));
        animals.add("cat");
        animals.add("dog");
        animals.addFirst("buffalo");
        animals.addLast("Chicken");
        System.out.println(animals.get(2));
        // animals.remove("cat");
        // animals.removeFirst();
        // animals.removeLast();
        animals.removeAll(removeAnimals);
        System.out.println(animals);
    }
}