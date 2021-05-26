package Factory;

import Factory01.Factory;

public class DatabaseProduct implements Product{
    @Override
    public void product() {
        System.out.println("数据备份");
    }
}
