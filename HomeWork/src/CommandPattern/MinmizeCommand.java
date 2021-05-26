package CommandPattern;

public class MinmizeCommand extends Command{
    private WindowHanlder windowHanlder;

    public MinmizeCommand() {
        windowHanlder = new WindowHanlder();
    }

    @Override
    public void execute() {
        windowHanlder.minmize();
    }
}
