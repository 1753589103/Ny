package CommandPattern.Undo;

public class CreateCommand extends Command{
    private Adder adder = new Adder();
    private int value;

    public void CreateCommand(Adder adder) {
        this.adder = adder;
    }

    @Override
    public int excute(int value) {
        this.value = value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
