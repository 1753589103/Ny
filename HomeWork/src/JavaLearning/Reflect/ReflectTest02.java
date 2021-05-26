package JavaLearning.Reflect;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReflectTest02 {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("D:\\Lei\\HomeWork\\src\\classinfo.properties");
            Properties properties=new Properties();
            properties.load(fileReader);
            fileReader.close();
            String s=properties.getProperty("class");
            System.out.println(s);
            Class c=Class.forName(s);
            Object obj=c.newInstance();
            System.out.println(obj);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
