package sk.mka.gl.group2.less10;

import sk.mka.gl.group2.less10.stars.Star;
import sk.mka.gl.group2.less10.utils.MathUtil;
import sk.mka.gl.group2.less10.utils.PrintUtil;

public class Main {

    public static void main(String[] args) {
        Star star = new Star();
        star.printStar();

        Star star1 = new Star();
        star1.printStar();

        Star star2 = new Star();
        star2.printStar();

        /*static method exmample */
        PrintUtil.printValue("som_hviezda");

        System.out.println("Star.STAR_COUNTER: " + Star.STAR_COUNTER);

        int a = 3;
        int b = 4;
        double sum = MathUtil.sum(a, b);
        System.out.println("sum: " + sum);
    }
}