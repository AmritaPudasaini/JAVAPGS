import java.util.Scanner;
public class FitnessTracker {
    static final double CALORIES_PER_STEP = 0.04;
    static final double STANDARD_WEIGHT = 70.0;
    public static double calculateCaloriesBurned(int steps, double weight) {
        return (steps * weight * CALORIES_PER_STEP) / STANDARD_WEIGHT;
    }
    public static void suggestWorkoutPlan(int age, double BMI) {
        System.out.println("Based on your BMI and age, here’s a suggested workout plan:");
        if (BMI < 18.5) {
            System.out.println("Underweight: Focus on light strength training and balanced diet.");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal: Maintain with cardio, strength training, and flexibility workouts.");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("Overweight: Incorporate cardio (running, cycling) and bodyweight exercises.");
        } else {
            System.out.println("Obese: Low-impact cardio (walking, swimming) and diet control.");
        }
        if (age < 18) {
            System.out.println("Age-specific: Keep exercises playful and fun—avoid heavy lifting.");
        } else if (age <= 40) {
            System.out.println("Age-specific: Moderate to intense workouts like HIIT, weight training, running.");
        } else {
            System.out.println("Age-specific: Focus on joint-friendly exercises—yoga, swimming, brisk walking.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of steps: ");
        int steps = scanner.nextInt();

        System.out.print("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        double calories = calculateCaloriesBurned(steps, weight);
        System.out.printf("Calories burned: %.2f\n", calories);
        System.out.print("\nEnter your age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your BMI: ");
        double BMI = scanner.nextDouble();
        suggestWorkoutPlan(age, BMI);
    }
}
