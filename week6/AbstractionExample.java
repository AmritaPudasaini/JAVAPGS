abstract class User{
    abstract void login(); // abstract method
    void detail(){ // concrete
    }
}

class Admin extends User{
    @Override
    void login(){
        System.out.println("admin logged in");
    }
}

class SuperAdmin extends  User{
    @Override
    void login(){
        System.out.println("Super admin logged in");
    }
}

public class AbstractionExample {
    public static void main (String[] args) {
        User u = new SuperAdmin();
        u.login();

    }
}