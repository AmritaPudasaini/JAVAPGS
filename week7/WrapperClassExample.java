public class WrapperClassExample{
public static void main(String[] args){
    int x=10;
    Integer val=x; //auto boxing
    int newVal=val; //un boxing

    String number="1234";
    int intVal=Integer.parseInt(number);
    String strVal=Integer.toString(intVal);
    
}
}