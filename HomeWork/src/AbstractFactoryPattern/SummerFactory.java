package AbstractFactoryPattern;

public class SummerFactory extends SkinFactory{
    @Override
    public Button creatButton() {
        Button button = new SummerButton();
        return button;
    }

    @Override
    public TextField creatTextField() {
        TextField textField = new SummerTextField();
        return textField;
    }

    @Override
    public ComboBox creatComboBox() {
        ComboBox comboBox = new SummerComboBox();
        return comboBox;
    }
}
