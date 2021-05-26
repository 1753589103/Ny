package IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProduct {
    protected List<Object> objects = new ArrayList<>();

    public AbstractProduct(List<Object> objects) {
        this.objects = objects;
    }

    public void addObjects(Object obj){
        this.objects.add(obj);
    }

    public void removeObject(Object obj){
        this.objects.remove(obj);
    }

    public List getObject(){
        return this.objects;
    }
    public abstract AbstractIterator createIterator();
}
