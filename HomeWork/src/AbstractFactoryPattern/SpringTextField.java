package AbstractFactoryPattern;

public class SpringTextField implements TextField{
    @Override
    public void display() {
        System.out.println("show Spring TextField");
    }
}
