package DesignParrentTest02;

public class Triangle extends Graph{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

    @Override
    public void erasure() {
        System.out.println("擦除三角形");
    }
}
