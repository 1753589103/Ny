package JavaLearning.Reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest03 {
    public static void main(String[] args) {
        try {
            Class c=Class.forName("JavaLearning.Reflect.Student");
            Field[] f=c.getFields();
            //System.out.println(f.length);
            Field fields=f[0];
/*            String s=fields.getName();
            System.out.println(s);*/
//            System.out.println("=============================");
            //获取所有Filed
            Field[] fields1=c.getDeclaredFields();
            //System.out.println(fields1.length);
           for (Field fs:fields1){
               //获取修饰符，返回的修饰符是一个数字
               int i = fs.getModifiers();
               System.out.println(i);
               //修饰符转String
               String modifiers = Modifier.toString(i);
               System.out.println(modifiers);
               System.out.println(fs.getName());
               //获取属性类型
               Class c2 = fs.getType();
               System.out.println(c2);
               System.out.println("=============================");


           }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
