package JavaLearning;

import java.util.ArrayList;
import java.util.List;

public class WaitTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        Thread t1 = new Thread(new Thread01(list));
        Thread t2 = new Thread(new Thread02(list));

        t1.setName("生产");
        t2.setName("消费");

        t1.start();
        t2.start();
    }
}

class Thread01 implements Runnable{
    private List list;

    public Thread01(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true){
            synchronized (list){
                if (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o = new Object();

                list.add(o);

                System.out.println(Thread.currentThread().getName()+"--->"+o);

                list.notifyAll();
            }
        }
    }
}

class Thread02 implements Runnable{
    private List list;

    public Thread02(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            synchronized (list){
                if (list.size() == 0){
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object o=list.remove(0);
                System.out.println(Thread.currentThread().getName()+"------>"+o);
                list.notifyAll();
            }
        }
    }
}