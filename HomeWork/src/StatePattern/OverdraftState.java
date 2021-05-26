package StatePattern;

public class OverdraftState extends AccountState{


    public OverdraftState(AccountState state) {
        this.account = state.account;
    }


    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount );
        stateCheck();

    }

    @Override
    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest() {
        System.out.println("compute");
    }

    @Override
    public void stateCheck() {
        if (account.getBalance() > 0 ){
            account.setState(new NormalState(this));
        }
        else if (account.getBalance() == -2000){
            account.setState(new RestrictedState(this));
        }
        else if (account.getBalance() < -2000){
            System.out.println("操作受限制");
        }
    }
}
