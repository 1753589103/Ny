package MementoPattern;

public class Client {
    public static void main(String[] args) {
        MementoCaretaker mementoCaretaker = new MementoCaretaker();

        Chessman chessman = new Chessman("车",1,1);
        display(chessman);

        mementoCaretaker.setChessmanMemento(chessman.save());

        chessman.setY(4);
        display(chessman);
        mementoCaretaker.setChessmanMemento(chessman.save());

        chessman.setX(6);
        display(chessman);

        System.out.println("=====================悔棋操作================");

        chessman.restore(mementoCaretaker.getMemento());
        display(chessman);
    }
    public static void display(Chessman chessman){
        System.out.println("棋子"+chessman.getLabel()+"位置"+chessman.getX()+chessman.getY());
    }
}
