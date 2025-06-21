class FirstThread extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println("hii");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class SecThread extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

class ThirdThread implements Runnable{
    @Override
    public void run(){
        System.out.println("third thread");
    }
}
public class JavaThreadDemo{
    public static void main(String[] args) {
        FirstThread t1=new FirstThread();
        SecThread t2=new SecThread();
        ThirdThread tt=new ThirdThread();
        Thread t3=new Thread(tt);

        t1.start();
        t2.start();
        t3.start();
    }
}