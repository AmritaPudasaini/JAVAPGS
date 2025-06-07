public class multiplication {
    
    public static int  sum(int num) {
        if (num > 0) {
            return num + sum(num-1);
        }
        else{
            return 0;
        }
    }

    public static int factorial(int number) {
        if(number > 0){
            return number * factorial (number-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int res = sum(10);
        System.out.println("res=" + res);

        int res2 = factorial(5);
        System.out.println("res2=" + res2);
    }
}