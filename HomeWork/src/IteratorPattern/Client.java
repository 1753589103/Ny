package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List products = new ArrayList();
        products.add("倚天剑");
        products.add("屠龙刀");
        products.add("断肠草");
        products.add("葵花宝典");
        products.add("四十二章经");

        Object o = new Object();

        AbstractProduct list;
        AbstractIterator iterator;

        list = new ConceretProduct(products); //创建聚合对象
        iterator = list.createIterator();	//创建迭代器对象

        //list.addObjects(o);

        System.out.println("正向遍历：");
        while(!iterator.isLast()) {
            System.out.print(iterator.getNext() + "，");
            iterator.next();
        }
        System.out.println();
        System.out.println("-----------------------------");

        System.out.println("逆向遍历：");
        while(!iterator.isFirst()) {
            System.out.print(iterator.getPrevious() + "，");
            iterator.previous();
        }
    }
}
