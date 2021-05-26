package CommandPattern.Undo;

public abstract class Command {
    public abstract int excute(int value);
    public abstract int undo();
}
