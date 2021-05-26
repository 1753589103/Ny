package ObserverPattern;

public class ConcreteAllyControlCenter extends AllyControlCenter{
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName+"战队创建成功");

        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友："+ name + "受到攻击！");
        for (Object player:arrayList){
            if (!((Observer)player).getName().equalsIgnoreCase(name)){
                ((Observer)player).help();
            }
        }
    }
}
