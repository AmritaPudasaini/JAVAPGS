public class ForLoopExample{
    public static void main(String[] args){
        // prime number

        int number=19;
        boolean isPrime=true;

        for (int i = 2; i < 19; i++) {
            if (number%i==0) {
                isPrime=false;
                break;
            }
        }

        if (isPrime){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime number");
        }
    }
}