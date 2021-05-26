package IteratorPattern;

interface AbstractIterator {
    //下一个
    public void next();
    //是否是最后一个
    public boolean isLast();
    //上一个
    public void previous();
    //是否是第一个
    public boolean isFirst();

    public Object getNext();

    public Object getPrevious();
}
