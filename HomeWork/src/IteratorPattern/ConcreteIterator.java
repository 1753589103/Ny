package IteratorPattern;

import java.util.List;

public class ConcreteIterator implements AbstractIterator{

    private ConceretProduct conceretProduct;

    private List products;

    private int cursor1;
    private int cursor2;

    public ConcreteIterator(ConceretProduct list) {
        this.conceretProduct = list;

        this.products = list.getObject();

        cursor1 = 0;

        cursor2 = products.size()-1;
    }

    @Override
    public void next() {
        if (cursor1 < products.size()){
            cursor1++;
        }
    }

    @Override
    public boolean isLast() {
        return (cursor1 == products.size());
    }

    @Override
    public void previous() {
        if (cursor2 > -1){
            cursor2--;
        }

    }

    @Override
    public boolean isFirst() {
        return (cursor2 == -1);
    }

    @Override
    public Object getNext() {
        return products.get(cursor1);
    }

    @Override
    public Object getPrevious() {
        return products.get(cursor2);
    }
}
