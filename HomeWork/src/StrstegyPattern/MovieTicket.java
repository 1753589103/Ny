package StrstegyPattern;

public class MovieTicket {
    private double price;
    private Discount discount;

    public double getPrice() {
        return discount.caculate(price);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(Discount discount){
        this.discount = discount;
    }

}
