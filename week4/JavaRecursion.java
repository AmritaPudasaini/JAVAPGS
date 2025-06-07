public class JavaRecursion {
    
    public static int  sum(int num) {
        if (num > 0) {
            return num + sum(num-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int res = sum(10);
        System.out.println("res=" + res);
    }
}