package AbstractFactoryPattern;

public class SpringButton implements Button{

    @Override
    public void display() {
        System.out.println("show Spring Button");
    }
}
