package AbstractFactoryPattern;

public class SpringFactory extends SkinFactory{
    @Override
    public Button creatButton() {
        Button button = new SpringButton();
        return button;
    }

    @Override
    public TextField creatTextField() {
        TextField textField = new SpringTextField();
        return textField;
    }

    @Override
    public ComboBox creatComboBox() {
        ComboBox comboBox = new SpringConboBox();
        return comboBox;
    }
}
