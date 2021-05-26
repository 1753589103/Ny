package DesignParrentTest02;

public class GraphFactory {
    public static Graph getGraph(String args) {
        Graph graph = null;
        if (args.equalsIgnoreCase("cirecle")){
            graph = new Circle();
            System.out.println("初始化圆形");
        }else if (args.equalsIgnoreCase("square")){
            graph = new Square();
            System.out.println("初始化方形");
        }else if (args.equalsIgnoreCase("triangle")){
            graph = new Triangle();
            System.out.println("初始化三角形");
        }else{
            System.out.println("UnSupportedShapeException");
        }
        return graph;
    }
}
