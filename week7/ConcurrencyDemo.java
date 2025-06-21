public class ConcurrencyDemo extends Thread{
    public static int amount=0;

        @Override
        public void run(){
            amount++;
        }

    public static void main(String[] args) {
        ConcurrencyDemo c = new ConcurrencyDemo();
        c.start();

        while (c.isAlive()){
            System.out.println("waiting.......");
        }
        System.out.println("amount=" + amount);
        amount++;
        System.out.println("amount=" + amount);
    }
}