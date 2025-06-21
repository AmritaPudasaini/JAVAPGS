import java.io.FileWriter;
import java.io.IOException;

public class StudentGradeManagement {

    public static void main(String[] args) {
        String name = "John";
        String[] subjects = {"Math", "Science", "Programming"};
        int[] practicalMarks = {12, 15, 18};
        int[] theoryMarks = {20, 25, 22};
        String filename = "Student_Certificate.txt";

        try {
            FileWriter writer = new FileWriter(filename);

            writer.write("-------- Student Certificate --------\n");
            writer.write("Name: " + name + "\n\n");

            for (int i = 0; i < subjects.length; i++) {
                int total = practicalMarks[i] + theoryMarks[i];
                writer.write("Subject: " + subjects[i] + "\n");
                writer.write("  Practical Marks: " + practicalMarks[i] + "\n");
                writer.write("  Theory Marks: " + theoryMarks[i] + "\n");
                writer.write("  Total Marks: " + total + "\n\n");
            }

            writer.write("Certificate generated successfully.\n");

            writer.close();

            System.out.println("Certificate has been written to " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the certificate.");
            e.printStackTrace();
        }
    }
}