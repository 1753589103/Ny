package PrototypeManagerPatten;

public class FAR implements OfficialDuctment{

    @Override
    public OfficialDuctment clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (OfficialDuctment) obj;
    }

    @Override
    public void diplay() {
        System.out.println("FAR");

    }
}
