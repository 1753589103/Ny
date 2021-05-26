package PrototypeManagerPatten;

import java.util.HashMap;

class PrototypeManager {
    //定义一个HashMap集合
    private HashMap hashMap = new HashMap();
    //懒汉式单例模式
    private static PrototypeManager prototypeManager = new PrototypeManager();
    //增加原型
    private PrototypeManager(){
        hashMap.put("FAR",new FAR());
        hashMap.put("SRS",new SRS());
    }
    //添加新的原型
    public void addOfficialDuctment(String key,OfficialDuctment doc){
        hashMap.put(key,doc);
    }
    //浅克隆获取新的对象
    public OfficialDuctment getOfficiaDuctment(String key){
        return (OfficialDuctment) hashMap.get(key);
    }
    //静态方法获取本类唯一对象
    public static PrototypeManager getPrototypeManager(){
        return prototypeManager;
    }
}
