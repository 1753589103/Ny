package Factory;

public class Test {
    public static void main(String[] args) {
       Factory factory;
       Product product;

       factory = new DatabaseFactory();

       product = factory.fatoryMathod();

       product.product();
    }
}
