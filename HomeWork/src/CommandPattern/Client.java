package CommandPattern;

public class Client {
    public static void main(String[] args) {
        Command command;
        FBSettingWindow fbSettingWindow = new FBSettingWindow();

        fbSettingWindow.setTitle("功能表");

        FunctionButton functionButton = new FunctionButton();
        functionButton.setName("功能键1");

        fbSettingWindow.addFunctionButton(functionButton);


        command = new HelpCommand();
        functionButton.setCommand(command);

/*        functionButton.getName();
        fbSettingWindow.display();*/
        fbSettingWindow.display();
        functionButton.onClick();

    }
}
