package CommandPattern;

public class FunctionButton {
    private String name;
    private Command command;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCommand(Command command){
        this.command = command;
    }

    public void onClick(){
        System.out.println("点击功能键");
        command.execute();
    }
}
