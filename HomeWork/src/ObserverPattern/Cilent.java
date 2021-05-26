package ObserverPattern;

public class Cilent {
    public static void main(String[] args){
        AllyControlCenter allyControlCenter;
        allyControlCenter = new ConcreteAllyControlCenter("金庸战神");

        Observer observer,observer1,observer2,observer3;

        observer = new Player("傻子0号");
        observer1 = new Player("傻子1号");
        observer2 = new Player("傻子2号");
        observer3 = new Player("傻子3号");

        allyControlCenter.join(observer);
        allyControlCenter.join(observer1);
        allyControlCenter.join(observer2);
        allyControlCenter.join(observer3);

        observer.beAttacked(allyControlCenter);

    }
}
