import java.util.Scanner;
public class StudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter Initial Marks: ");
        int marks = Integer.parseInt(scanner.nextLine());
        Student student = new Student(name, rollNumber, marks);

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks: " + student.getMarks());

        System.out.print("\nTeacher - Enter new marks for the student: ");
        int newMarks = Integer.parseInt(scanner.nextLine());
        Teacher.updateMarks(student, newMarks);

        System.out.println("\nUpdated Marks for " + student.getName() + ": " + student.getMarks());
        scanner.close();
    }
}
class Student {
    private String name;
    private int rollNumber;
    private int marks;
    public Student(String name, int rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        setMarks(marks); // validate initial marks
    }
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public int getMarks() {
        return marks;
    }

    protected void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Marks must be between 0 and 100.");
        }
    }
}
class Teacher {
    public static void updateMarks(Student student, int newMarks) {
        student.setMarks(newMarks);
        System.out.println("Teacher updated the marks.");
    }
}
