import java.util.HashMap;

public class JavaHashMap {
    public static void main(String[] args) {
        //user list
        //1. ram
        //2. hari
        //3. john
        HashMap<Integer, String> users=new HashMap<>();
        users.put(1, "ram");
        users.put(2, "hari");
        users.put(3, "john");
        System.out.println(users.get(1));
        System.out.println(users.containsKey(2));
        System.out.println(users.containsValue("ram"));
        
        for (int key:users.keySet()){
            System.out.println(users.get(key));
        }

        for (String value:users.values()){
            System.out.println(value);
        }

        users.remove(3);
        
        System.out.println(users);
    }
}