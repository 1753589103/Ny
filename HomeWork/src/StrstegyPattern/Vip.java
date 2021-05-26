package StrstegyPattern;

public class Vip implements Discount{
    @Override
    public double caculate(double price) {
        System.out.println("vip");
        return price-20;
    }
}
