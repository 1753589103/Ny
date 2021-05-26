package IteratorPattern;

import java.util.List;

public class ConceretProduct extends AbstractProduct{
    public ConceretProduct(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ConcreteIterator(this);
    }

}
