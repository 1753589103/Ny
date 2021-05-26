package ProxyPattern;

public class ZhangLaoHan implements Iperson{
    private ZhangSan zhangSan;

    public ZhangLaoHan(ZhangSan zhangSan) {
        this.zhangSan = zhangSan;
    }

    @Override
    public void findTeacher() {
        zhangSan.findTeacher();
        System.out.println("张老汉开始找老师");
        System.out.println("找到老师开始学习");
    }
}
