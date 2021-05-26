package DesignParrentTest02;

public class Test02 {
    public static void main(String[] args) {

        Graph graph = GraphFactory.getGraph("square");
        graph.draw();
        graph.erasure();
    }
}
