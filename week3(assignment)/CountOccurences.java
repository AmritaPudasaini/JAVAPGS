public class CountOccurences {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        int count = 0;

        for (int num : array) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Count of " + target + ": " + count);
    }
}
