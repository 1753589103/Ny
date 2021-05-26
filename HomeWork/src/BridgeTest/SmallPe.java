package BridgeTest;

public class SmallPe extends PenAbstract{
    @Override
    public void writeWord() {
        colorInterface.paintColor();
        System.out.println("细体字");
    }
}
