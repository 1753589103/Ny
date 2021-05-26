package DesignParrentTest;

public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton04 singleton01 = Singleton04.getInstance();
        Singleton04 singleton02 = Singleton04.getInstance();
        System.out.println(singleton01 == singleton02);
        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());
    }
}
class Singleton04{
    //私有化
    private Singleton04(){
    }
    private static Singleton04 singleton04;
    public static synchronized Singleton04 getInstance(){
        if (singleton04 == null){
            singleton04=new Singleton04();
        }
        return singleton04;
    }

}
