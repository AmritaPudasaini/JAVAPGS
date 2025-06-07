public class JavaConditionExample {
    public static void main(String[] args) {
        int age =10;
        if(age>=16){
            System.out.println("eligible");
        }
        else{
            System.out.println("not Eligible");
        }

        int day=2;
        if (day==1){
            System.out.println("Sunday");
        }
        else if (day==2){
            System.out.println("Monday");
        }
        else if (day==3){
            System.out.println("Tuesday");
        }
        else{
            System.out.println("Day not found");
        }
    }
}