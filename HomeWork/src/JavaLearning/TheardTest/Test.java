package JavaLearning.TheardTest;

public class Test {
    public static void main(String[] args) {
        //创建账户对象
        Account account = new Account("act -001",10000);

        Thread t1 = new MyRunnable(account);

        Thread t2 = new MyRunnable(account);

        t1.setName("t1");

        t2.setName("t2");

        t1.start();

        t2.start();

    }
}
