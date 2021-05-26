package BridgeTest;

public class BigPen extends PenAbstract{
    @Override
    public void writeWord() {
        colorInterface.paintColor();
        System.out.println("粗体字");
    }
}
