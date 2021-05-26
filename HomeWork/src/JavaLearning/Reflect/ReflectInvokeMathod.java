package JavaLearning.Reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectInvokeMathod {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class mathodc = Class.forName("JavaLearning.Reflect.MathodTest");

        Object mathod = mathodc.newInstance();

        Method mathodTest = mathodc.getDeclaredMethod("login", String.class, String.class);

        Object result =  mathodTest.invoke(mathod,"nyf","nyf622424");
        System.out.println(result);

        Method mathodTest01 = mathodc.getDeclaredMethod("Exit");

        mathodTest01.invoke(mathod);
    }
}
