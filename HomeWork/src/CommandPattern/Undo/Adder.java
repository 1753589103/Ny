package CommandPattern.Undo;

public class Adder {
    private int num;

    public int add(int value){
        num += value;
        return num;
    }
}
