package AbstractFactoryPattern;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) {
/*        SkinFactory skinFactory;
        Button button;a
        ComboBox comboBox;
        TextField textField;`
        skinFactory = new SpringFactory();
        button = skinFactory.creatButton();
        comboBox = skinFactory.creatComboBox();
        textField = skinFactory.creatTextField();
        button.display();
        comboBox.display();
        textField.display();*/
        //反射机制创建对象
        Button button;
        ComboBox comboBox;
        TextField textField;
        try {
            FileReader fileReader = new FileReader("D:\\Lei\\HomeWork\\src\\AbstractFactoryPattern\\classField.properties");
            Properties properties = new Properties();
            properties.load(fileReader);
            fileReader.close();

            Class mathod = Class.forName(properties.getProperty("class"));
            Object obj=mathod.newInstance();
            SkinFactory skinFactory =(SkinFactory) obj;
            button = skinFactory.creatButton();
            comboBox = skinFactory.creatComboBox();
            textField = skinFactory.creatTextField();

            button.display();
            comboBox.display();
            textField.display();

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
