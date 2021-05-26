package DecoratorPattern;

public class ScrollBarDecorator extends CompotentDecorator{
    public ScrollBarDecorator(Compotent compotent) {
        super(compotent);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("为窗体创建滚动条");
    }
}
