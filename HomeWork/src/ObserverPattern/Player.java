package ObserverPattern;

public class Player implements Observer{
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void help() {
        System.out.println("坚持住"+this.name+"来救你了");
    }

    @Override
    public void beAttacked(AllyControlCenter allyControlCenter) {
        System.out.println(this.name+"被攻击");
        allyControlCenter.notifyObserver(name);
    }
}
