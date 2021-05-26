package CompositePattern;

import java.util.ArrayList;

public class Folder extends AbstractFile{
    private String Name;

    public Folder(String name) {
        this.Name = name;
    }
    //容器数组
    ArrayList<AbstractFile> arrayList = new ArrayList<>();

    @Override
    public void addFile(AbstractFile abstractFile) {
        arrayList.add(abstractFile);
    }

    @Override
    public void removeFile(AbstractFile abstractFile) {
        arrayList.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int i) {
        return arrayList.get(i);
    }

    @Override
    public void killVirou() {
        System.out.println("do"+Name+"killVirous");
        for(AbstractFile t:arrayList){
            //递归调用成员构建killVirou方法
            t.killVirou();
        }
    }
}
