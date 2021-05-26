package CompositePattern;

public class TextFile extends AbstractFile{
    private String Name;

    public TextFile(String name) {
        this.Name = name;
    }

    @Override
    public void addFile(AbstractFile abstractFile) {
        System.out.println("do not supproted");
    }

    @Override
    public void removeFile(AbstractFile abstractFile) {
        System.out.println("do not supproted");;
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("do not supported");
        return null;
    }

    @Override
    public void killVirou() {
        System.out.println("do"+Name+"killVirous");;
    }
}
