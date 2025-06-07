public class divisible {
    public static void main(String[] args) {
        int num = 16;
        if (num % 3 == 0 && num % 5==0){
            System.out.println("The number is divisible by both 3 and 5");
        }
        else{
            System.out.println("The number is not divisible by both 3 and 5");
        }

    }
}