package sk.mka.gl.group2.less10;

public class Star {

    public static int STAR_COUNTER;
    public int starCount;

    public Star() {
        starCount++;
        STAR_COUNTER++;
    }

    private int count;

    public void printStar() {
        System.out.println("*");
    }
}
