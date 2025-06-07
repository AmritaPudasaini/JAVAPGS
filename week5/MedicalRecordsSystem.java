import java.util.Scanner;

public class MedicalRecordsSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Medical History: ");
        String medicalHistory = scanner.nextLine();

        Patient patient = new Patient(name, medicalHistory);

        System.out.println("\nPatient Name: " + patient.getName());
        System.out.println("Medical History: " + patient.viewMedicalHistory());

        System.out.print("\nDoctor - Enter updated medical history: ");
        String updatedHistory = scanner.nextLine();
        Doctor.updateMedicalHistory(patient, updatedHistory);
        System.out.println("\nUpdated Medical History for " + patient.getName() + ": " + patient.viewMedicalHistory());
        scanner.close();
    }
}
class Patient {
    private String name;
    private String medicalHistory;
    public Patient(String name, String medicalHistory) {
        this.name = name;
        this.medicalHistory = medicalHistory;
    }
    public String getName() {
        return name;
    }
    public String viewMedicalHistory() {
        return medicalHistory;
    }
    // Only Doctor can set medical history
    protected void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
class Doctor {
    public static void updateMedicalHistory(Patient patient, String newHistory) {
        patient.setMedicalHistory(newHistory);
        System.out.println("Doctor updated the medical history successfully.");
    }
}
