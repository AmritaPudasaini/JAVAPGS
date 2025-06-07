public class StudentManagementSystem {
    public static void main(String[] args) {
        System.out.println("----- Student Details -----");
        Student student1 = new Student("Amrita", 101, "A", 89.5);
        Student student2 = new Student("Bob", 102, "B", 76.0);
        Student student3 = new Student("Charlie", 103, "A+", 92.3);
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}

class Student {
    private String name;
    private int rollNumber;
    private String grade;
    private double marks;

    public Student(String name, int rollNumber, String grade, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.marks = marks;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Marks: " + marks);
        System.out.println("-----------------------------");
    }
}
