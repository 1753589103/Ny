package ObserverPattern;

import java.util.ArrayList;

public abstract class AllyControlCenter {
    protected String allyName;
    protected ArrayList<Observer> arrayList = new ArrayList<>();

    public void setAllyName(String allyName){
        this.allyName = allyName;
    }
    public String getAllyName(){
        return allyName;
    }
    //注册
    public void join(Observer observer){
        System.out.println(observer.getName()+"加入"+getAllyName()+"战队！");
        arrayList.add(observer);
    }
    //注销
    public void remove(Observer observer){
        System.out.println(observer.getName()+"推出"+getAllyName()+"战队");
        arrayList.remove(observer);
    }
    public abstract void notifyObserver(String name);
}
