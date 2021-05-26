package Factory;

public class FileProduct implements Product{
    @Override
    public void product() {
        System.out.println("文件备份");
    }
}
