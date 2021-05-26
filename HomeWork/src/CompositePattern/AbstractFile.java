package CompositePattern;

public abstract class AbstractFile {
    public void addFile(AbstractFile abstractFile){}
    public void removeFile(AbstractFile abstractFile){}
    public AbstractFile getChild(int i){return null;}
    public void killVirou(){}
}
