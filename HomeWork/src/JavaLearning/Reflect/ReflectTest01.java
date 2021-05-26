package JavaLearning.Reflect;

public class ReflectTest01 {
    public static void main(String[] args) {
        try {
            Class c=Class.forName("JavaLearning.Reflect.User");
            Object obj = c.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
