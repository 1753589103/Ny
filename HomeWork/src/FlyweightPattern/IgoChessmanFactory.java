package FlyweightPattern;

import java.util.HashMap;

public class IgoChessmanFactory {
    private static IgoChessmanFactory igoChessmanFactory = new IgoChessmanFactory();
    private static HashMap hs;

    private IgoChessmanFactory() {
        hs = new HashMap();
        IgoChessman Black,White;
        Black = new BlackIgoChessman();
        hs.put("b",Black);
        White = new WhiteIgoChessman();
        hs.put("w",White);

    }
    //从hash表中获取棋子
    public static IgoChessman getIgoChessman(String color){
        return (IgoChessman)hs.get(color);
    }
    //提供对外的获取IgoChessmanFactory（）对象的；
    public static IgoChessmanFactory getIgoChessmanFactory(){
        return igoChessmanFactory;
    }
}
