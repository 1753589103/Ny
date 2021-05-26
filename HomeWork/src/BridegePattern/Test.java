package BridegePattern;

public class Test {
    public static void main(String[] args) {
        Image image;

        image = new BMPImage();

        image.setImageLmp(new LinuxLmp());

        image.parseFile();
    }
}
