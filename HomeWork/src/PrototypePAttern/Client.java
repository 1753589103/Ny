package PrototypePAttern;

public class Client {
    public static void main(String[] args) {
        //创建原型对象
        Weekly weekly = new Weekly();

        weekly.setDate("第三周");
        weekly.setName("张无忌");
        weekly.setContent("工作很忙天天加班");

        System.out.println(weekly.getDate());
        System.out.println(weekly.getName());
        System.out.println(weekly.getContent());
        System.out.println("==========================");

        Weekly weekly1;
        weekly1 = weekly.clone();

        weekly1.setDate("第一周");
        System.out.println(weekly1.getDate());
        System.out.println(weekly1.getName());
        System.out.println(weekly1.getContent());
        System.out.println("============");
    }
}
