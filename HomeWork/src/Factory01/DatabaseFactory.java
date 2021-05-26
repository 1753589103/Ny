package Factory01;

public class DatabaseFactory extends Factory{

    @Override
    public Product creatFactorys() {
        Product product = new DatabaseProduct();
        return product;
    }
}
