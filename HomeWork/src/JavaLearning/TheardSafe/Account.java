package JavaLearning.TheardSafe;

public class Account {
    private String accountId;
    private double balance;

    public Account() {
    }

    public Account(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDraw(double money){
        //取款前余额
        synchronized (Account.class){
            Double befor = this.getBalance();
            //取款之后的余额
            Double after = befor - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //更新余额
            setBalance(after);
        }

    }
}
