import java.util.Scanner;
public class WhileMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to print multiplication: ");
        int number = scanner.nextInt();

        int i = 1;

        while(i <= 10) {
            System.out.println(number + " * " + i + "=" + (number * i));
            i++;
        }
        scanner.close();
    }
}