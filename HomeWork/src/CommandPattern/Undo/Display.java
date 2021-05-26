package CommandPattern.Undo;

public class Display {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void compute(int value){
        int i = command.excute(value);
        System.out.println("计算结果"+i);

    }

    public void undo(){
        int i = command.undo();
        System.out.println("撤销后的结果"+i);
    }

}
