public class sum {
    public static void main(String[] args) {
        int i = 1, sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("Sum from 1 to 10 is: " + sum);
    }
}
