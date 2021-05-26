package StrstegyPattern;

public class Child implements Discount{
    @Override
    public double caculate(double price) {
        System.out.println("child");
        return price*0.5;
    }
}
