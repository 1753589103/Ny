package CommandPattern;

import java.util.ArrayList;

public class FBSettingWindow {
    private String title;
    //定义存储功能键的集合
    private ArrayList<FunctionButton> arrayList = new ArrayList<FunctionButton>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void addFunctionButton(FunctionButton functionButton){
        arrayList.add(functionButton);
    }
    public void removeFunvtionButton(FunctionButton functionButton){
        arrayList.remove(functionButton);
    }
    public void display(){
        System.out.println("显示窗口"+this.title);
        System.out.println("功能按键");
        for(FunctionButton arrayList1:arrayList){
            System.out.println(arrayList1.getName());
        }
    }
}
