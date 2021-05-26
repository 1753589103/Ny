package Factory01;

public class OtherFactory extends Factory{
    @Override
    public Product creatFactorys() {
        Product product = new OtherProduct();
        return product;
    }
}
