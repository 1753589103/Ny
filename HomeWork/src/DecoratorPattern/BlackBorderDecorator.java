package DecoratorPattern;

public class BlackBorderDecorator extends CompotentDecorator{
    public BlackBorderDecorator(Compotent compotent) {
        super(compotent);
    }

    @Override
    public void display() {

        this.setBlackBorder();

        super.display();
    }

    private void setBlackBorder() {
        System.out.println("为窗体创建黑色边框");
    }
}
