public class EligibilityScholarship {
    public static void main(String[] args) {
        double GPA = 2.0;
        if (GPA > 3.5) {
            System.out.println("Eligible for full scholarship");
        } else if (GPA >= 3.0 && GPA<=3.49) {
            System.out.println("Eligible for partial scholarship");
        }
        else{
            System.out.println("Not eligible for scholarship");
        }
            
    }
}