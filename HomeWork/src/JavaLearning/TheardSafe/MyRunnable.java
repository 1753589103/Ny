package JavaLearning.TheardSafe;

public class MyRunnable extends Thread{
    @Override
    public void run() {
        act.withDraw(5000);
        System.out.println(Thread.currentThread().getName()+act.getAccountId()+"取款成功,余额"+act.getBalance());
    }

    private Account act;

    public MyRunnable(Account act) {
        this.act=act;
    }
}
