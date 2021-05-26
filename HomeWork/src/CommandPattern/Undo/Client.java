package CommandPattern.Undo;

public class Client {
    public static void main(String[] args) {
        Command command;

        Display display = new Display();

        command = new CreateCommand();

        display.setCommand(command);

        display.compute(10);
        display.compute(10);
        display.undo();
    }
}
