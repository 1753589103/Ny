package DecoratorPattern;

public class CompotentDecorator extends Compotent{
    //维持一个对结构对象的引用
    protected Compotent compotent;
    //注入
    public CompotentDecorator(Compotent compotent) {
        this.compotent = compotent;
    }

    @Override
    public void display() {
        compotent.display();
    }
}
