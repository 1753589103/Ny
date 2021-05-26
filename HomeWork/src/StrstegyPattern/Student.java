package StrstegyPattern;

public class Student implements Discount{
    @Override
    public double caculate(double price) {
        System.out.println("student");
        return price*0.8;
    }
}
