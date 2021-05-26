package MementoPattern;

public class Chessman {
    private String label;
    private int x;
    private int y;

    public Chessman(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    //保存到备忘录
    public ChessmanMemento save(){
        return new ChessmanMemento(this.label,this.x,this.y);
    }
    //从备忘录恢复
    public void restore(ChessmanMemento chessmanMemento){
        this.label=chessmanMemento.getLabel();
        this.x=chessmanMemento.getX();
        this.y=chessmanMemento.getY();
    }
}
