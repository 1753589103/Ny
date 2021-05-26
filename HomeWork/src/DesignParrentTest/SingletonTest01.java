package DesignParrentTest;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton01 singleton01=Singleton01.getInstance();
        Singleton01 singleton02=Singleton01.getInstance();
        System.out.println(singleton01 == singleton02);
        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());
    }
}
class Singleton01{
//    构造器私有化
    private Singleton01(){
    }
    //本类内部创建对象实例
    private final static Singleton01 singleton=new Singleton01();
    //提供一个共有的静态方法，返回实例对象
    public static Singleton01 getInstance(){
        return singleton;
    }
}
