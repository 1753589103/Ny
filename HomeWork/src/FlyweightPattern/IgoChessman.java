package FlyweightPattern;

public abstract class IgoChessman {
    //获取棋子颜色
    public abstract String getColor();
    //显示棋子颜色
    public void display(){
        System.out.println("棋子颜色"+this.getColor());
    }

}
