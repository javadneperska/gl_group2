package sk.mka.gl.group2.less4;


public class Main {

    public static void main(String[] args) {

        boolean x = true;
        int y = 0;
        int z = 1;

        if (x == true) {
            System.out.println("x: " + x);
            y = -1;
        } else {
            System.out.println("x: " + x);
            z = -1;
        }

//        1.
        int w = (x == true) ? 2 : 1;

//        2.
        if (x == true) {
            w = 2;
        } else {
            w = 1;
        }
    }

}
