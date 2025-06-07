public class VariableScope {
    int count=0;

    void printInfo(){
        count ++;
    }
    public static void calc() {
        int num = 10;

        if (num==10){
            int i = 0;
        }
    }
    public static void main(String[] args) {
        System.out.println();
    }
}