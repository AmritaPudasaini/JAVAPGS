public class MainRun {
    public static void main(String[] args) {
        CollegeStudent cs=new CollegeStudent();
        cs.setName("amar");
        cs.setAge(26);
        System.out.println("name="+cs.getName());


        BankAccountExample b=new BankAccountExample();
        b.setAccHolderName("john");
        b.setAccNumber("2334567");
        b.setBalance(100);
        b.deposit(50);
        b.withdraw(200);

        System.out.println("Final balance="+b.getBalance());


    }
}