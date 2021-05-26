package DesignParrentTest;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton05 singleton01 = Singleton05.getInstance();
        Singleton05 singleton02 = Singleton05.getInstance();
        System.out.println(singleton01 == singleton02);
        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());
    }
}
class Singleton05{
    //私有化
    private Singleton05(){
    }
    private static Singleton05 singleton05;
    public static Singleton05 getInstance(){
        if (singleton05 == null){
            synchronized (Singleton05.class){
                if (singleton05 == null){
                    singleton05=new Singleton05();
                }
            }
        }
        return singleton05;
    }

}