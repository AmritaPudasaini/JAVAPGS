interface Remote {
    void pressPower();
}
interface Screen{
    void display();
}

class TVRemote implements Remote, Screen{
    @Override
    public void pressPower(){
        System.out.println("TV on");
    }
    @Override
    public void display(){
        System.out.println("display");
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        Remote r=new TVRemote();
        r.pressPower();
    }
}