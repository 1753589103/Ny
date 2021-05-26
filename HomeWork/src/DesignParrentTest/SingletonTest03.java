package DesignParrentTest;

public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton03 singleton01=Singleton03.getInstance();
        Singleton03 singleton02=Singleton03.getInstance();
        System.out.println(singleton01 == singleton02);
        System.out.println(singleton01.hashCode());
        System.out.println(singleton02.hashCode());
    }
}
class Singleton03{
    //构造器私有化
    private Singleton03(){
    }
    //本类内部创建对象实例
    private static  Singleton03 singleton;

    //提供一个共有的静态方法，返回实例对象
    public static Singleton03 getInstance(){
        if (singleton == null){
            singleton=new Singleton03();
        }
        return singleton;
    }
}
