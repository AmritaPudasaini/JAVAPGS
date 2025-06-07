public class VoteEligible {
    public static void main(String[] args) {
        int age = 19;
        if (age == 18) {
            System.out.println("Eligible");
        } else if (age<18) {
            System.out.println("Not eligible to vote");
        }
        else if (age>18) {
            System.out.println("Already eligible to vote");
        }
    }
}