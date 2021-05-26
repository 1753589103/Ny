package FacadePattern;

public class Facade {
    private SystemA systemA = new SystemA();
    private SystemB systemB = new SystemB();
    private SystemC systemC = new SystemC();

    public void mathod(){
        systemA.mathodA();
        systemB.mathodB();
        systemC.mathodC();
    }
}
