package JavaLearning.Reflect;

public class ReflectTest {
    public static void main(String[] args) {
        Class c1 = null;
        Class c2=null;
        Class c3=null;
        Class c4=null;
        try {
            c1 = Class.forName("java.lang.String");
            c2 = Class.forName("java.util.Date");
            c3 = Class.forName("java.lang.System");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String S="abc";
        Class z=S.getClass();
        System.out.println(z==c1);
        Class a=String.class;
        System.out.println(a==c1);
    }
}
