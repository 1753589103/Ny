package StatePattern;

public class Account {
    private AccountState state;
    private String name;
    private double balance=0;

    public Account(String name, double balance) {
        this.name = name;

        this.balance = balance;

        this.state = new NormalState(this);
        System.out.println(this.name+"开户成功"+"账户余额"+this.balance);
        System.out.println("------------------------------------------");

    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setState(AccountState state){
        this.state = state;
    }

    public void deposit(double amount){
        System.out.println(this.name + "存款" + amount);
        state.deposit(amount);
        System.out.println("显示余额"+this.balance);
        System.out.println("现在账户状态为"+this.state.getClass().getName());
        System.out.println("-----------------------------------------------");
    }
    public void withdraw(double amount){
        System.out.println(this.name+ "取款" + amount);
        state.withdraw(amount);
        System.out.println("显示余额"+this.balance);
        System.out.println("现在账户状态为"+this.state.getClass().getName());
        System.out.println("-----------------------------------------------");
    }

    public void computeInterest(){
        state.computeInterest();
    }
}
