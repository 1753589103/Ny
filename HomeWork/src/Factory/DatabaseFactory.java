package Factory;

public class DatabaseFactory implements Factory{
    @Override
    public Product fatoryMathod() {
        Product product = new DatabaseProduct();
        return product;
    }
}
