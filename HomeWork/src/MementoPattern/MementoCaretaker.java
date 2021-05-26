package MementoPattern;

public class MementoCaretaker {
    private ChessmanMemento chessmanMemento;

    public ChessmanMemento getMemento() {
        return chessmanMemento;
    }

    public void setChessmanMemento(ChessmanMemento chessmanMemento1){
        this.chessmanMemento = chessmanMemento1;
    }
}
