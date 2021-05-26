package BridgeTest;

public class Test {
    public static void main(String[] args) {
        ColorInterface colorInterface;

        PenAbstract penAbstract;

        penAbstract = new BigPen();

        colorInterface = new Red();

        penAbstract.setColorInterface(colorInterface);

        penAbstract.writeWord();
    }
}
