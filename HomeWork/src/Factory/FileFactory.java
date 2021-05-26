package Factory;

public class FileFactory implements Factory{

    @Override
    public Product fatoryMathod() {
        Product product = new FileProduct();
        return product;
    }
}
