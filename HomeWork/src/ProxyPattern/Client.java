package ProxyPattern;

public class Client {
    public static void main(String[] args) {
        ZhangSan zhangSan = new ZhangSan();
        ZhangLaoHan zhangLaoHan = new ZhangLaoHan(zhangSan);

        zhangLaoHan.findTeacher();
    }
}
