package DesignParrentTest02;

public class Circle extends Graph{
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

    @Override
    public void erasure() {
        System.out.println("擦除圆形");
    }
}
