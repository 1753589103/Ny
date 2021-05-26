package CompositePattern;

import AbstractFactoryPattern.TextField;

public class Cilent {
    public static void main(String[] args) {

        Folder folder1,folder2,folder3;

        ImageFiled imageFiled1= new ImageFiled("小龙女.jpg");
        ImageFiled imageFiled2 = new ImageFiled("杨过.jpg");

        TextFile textField1 = new TextFile("WENBEN.doc");
        TextFile textField2 = new TextFile("WENBEN2222222.doc");
        TextFile textField3 = new TextFile("WENB33333222.doc");
        //添加文件
        folder1 = new Folder("SUN公司资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder1.addFile(folder2);
        folder1.addFile(folder3);
        folder2.addFile(imageFiled1);
        folder2.addFile(imageFiled2);
        folder3.addFile(textField1);
        folder3.addFile(textField2);
        folder3.addFile(textField3);
        System.out.println(folder3.getChild(2));
        folder1.killVirou();
    }
}
