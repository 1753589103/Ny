package DesignParrentTest;

public class SignletonTest02 {
    public static void main(String[] args) {
        Signleton singleton01=Signleton.getInstance();
        Signleton singleton02=Signleton.getInstance();
        System.out.println(singleton01 == singleton02);
        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());
    }
}
class Signleton{
    private Signleton(){
    }
    private static Signleton instance;

    static {
        instance=new Signleton();
    }
    public static Signleton getInstance(){
        return instance;
    }
}
