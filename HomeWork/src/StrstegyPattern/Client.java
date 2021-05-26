package StrstegyPattern;

public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();

        movieTicket.setPrice(200.0);

        Discount child,student,vip;
        child = new Child();
        student = new Student();
        vip = new Vip();

        movieTicket.setDiscount(child);
        System.out.println(movieTicket.getPrice());
        movieTicket.setDiscount(student);
        System.out.println(movieTicket.getPrice());
        movieTicket.setDiscount(vip);
        System.out.println(movieTicket.getPrice());
    }
}
