package Factory01;

public class DatabaseProduct implements Product{
    @Override
    public void creatProduct() {
        System.out.println("数据备份");
    }
}
