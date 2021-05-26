package CommandPattern;

public class HelpCommand extends Command{
    private HelpHanlder helpHanlder;

    public HelpCommand() {
        helpHanlder = new HelpHanlder();
    }

    @Override
    public void execute() {
        helpHanlder.display();
    }
}
