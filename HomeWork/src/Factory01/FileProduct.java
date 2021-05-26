package Factory01;

public class FileProduct implements Product{
    @Override
    public void creatProduct() {
        System.out.println("文件备份");
    }
}
