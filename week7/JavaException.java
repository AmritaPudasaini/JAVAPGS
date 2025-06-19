import java.io.FileNotFoundException;
import java.io.FileReader;

class MyException extends Exception{
    MyException(String msg){
        super(msg);
    }
}

public class JavaException {
    static void calc(int x, int y){
        System.out.println(x/y);
    }
    static void fileReader() throws FileNotFoundException {
        FileReader read=new FileReader("text.txt");
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        try {
            System.out.println(nums[10]);
            calc(2,0);
        } catch (ArithmeticException e) {
            System.out.println("Exception:" +e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception:" +e);
        }catch(Exception e){
            System.out.println("exception:");
        }finally{
            System.out.println("Finally");
        }
        try{
            fileReader();
            int age=16;
            if (age < 20){
                throw new MyException("Not eligible for voting");
            }else {
                System.out.println("Eligible for voting");
            }
        }catch(Exception e){
            System.out.println("exception:" + e);
        }
        
        System.out.println("complete");
    }
}