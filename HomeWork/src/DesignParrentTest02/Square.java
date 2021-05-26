package DesignParrentTest02;

public class Square extends Graph{
    @Override
    public void draw() {
        System.out.println("绘制方形");
    }

    @Override
    public void erasure() {
        System.out.println("擦除方形");
    }
}
