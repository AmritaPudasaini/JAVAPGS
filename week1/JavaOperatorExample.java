public class JavaOperatorExample {
    public static void main(String[] args) {
        // increment operator
        int a = 10;
        int b = 0;
        b=++a; // pre-increment
        System.out.println(b); // 11
        System.out.println(a); // 11

        int c=20;
        int d=0;
        d=c++; // post-increment
        System.out.println(d); // 20
        System.out.println(c); // 21
    }
}