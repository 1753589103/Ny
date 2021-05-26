package DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        Compotent compotent,compotent1,compotent2;

        compotent = new Windows();

        compotent1 = new ScrollBarDecorator(compotent);

        compotent2 = new BlackBorderDecorator(compotent1);

        compotent1.display();
        System.out.println("================================================");
        compotent2.display();
    }
}
