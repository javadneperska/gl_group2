package sk.mka.gl.group2.less10;

public class Main {

    public static void main(String[] args) {
        Star star = new Star();
        star.printStar();

        Star star1 = new Star();
        star1.printStar();

        Star star2 = new Star();
        star2.printStar();

        /*static method exmample */
        Util.printValue("som_hviezda");

        System.out.println("Star.STAR_COUNTER: " + Star.STAR_COUNTER);
    }
}