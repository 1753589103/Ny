package DesignParrentTest01;

public class ChartFactory {
    public static Chart getChart(String arg){
        Chart chart = null;
        if (arg.equalsIgnoreCase("Histogram")){
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图");
        }else if (arg.equalsIgnoreCase("Pie")){
            chart = new PieChart();
            System.out.println("初始化设置饼状图");
        }else{
            chart = new LineChart();
            System.out.println("初始化设置折现图");
        }
        return chart;
    }
}
