package StatePattern;

public class Client {
    public static void main(String[] args) {
        Account account = new Account("小龙女",0.0);

        account.deposit(1000);
        account.withdraw(2000);
        account.deposit(3000);
        account.withdraw(4000);
        account.withdraw(1000);
        account.computeInterest();

    }
}
