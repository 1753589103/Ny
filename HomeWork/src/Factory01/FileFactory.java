package Factory01;

public class FileFactory extends Factory{

    @Override
    public Product creatFactorys() {
        Product product = new FileProduct();
        return product;
    }
}
