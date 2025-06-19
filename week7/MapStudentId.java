import java.util.HashMap;

public class MapStudentId {
    public static void main(String[] args) {
        HashMap<String, String> grades=new HashMap<>();

        grades.put ("S101", "A");
        grades.put ("S102", "B");
        grades.put ("S103", "B+");

        String grade = grades.get("S102");
        System.out.println("Grade for S102: " + grade);

        grades.put("S103", "A");
        grades.remove("S101");

        for (String id : grades.keySet()){
        System.out.println("Student Id: " + id + ", Grade: " +  grades.get(id));

        }
    }
}