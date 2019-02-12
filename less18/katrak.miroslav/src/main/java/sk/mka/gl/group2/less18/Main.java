package sk.mka.gl.group2.less18;

public class Main {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        rect.setHeight(2);
        rect.setWidth(3);
        System.out.println(rect.content());

        Block block = new Block();
        block.setWidth(2);
        block.setHeight(3);
        block.setDepth(4);
        System.out.println("content: " + block.content());
        System.out.println("volume: " + block.volume());

    }
}