class FirstThread extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println("hii");
        }
    }
}

class SecThread extends Thread{
    @Override
    public void run(){
        for (int i=1;i<=100;i++){
            System.out.println("Hello");
        }
    }
}
public class JavaThreadDemo{
    public static void main(String[] args) {
        FirstThread t1=new FirstThread();
        SecThread t2=new SecThread();

        t1.start();
        t2.start();
    }
}