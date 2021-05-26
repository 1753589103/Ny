package Factory01;

public abstract class Factory {
    public void creatProduct(){
        Product product = this.creatFactorys();
        product.creatProduct();
    }
    public abstract Product creatFactorys();
}
