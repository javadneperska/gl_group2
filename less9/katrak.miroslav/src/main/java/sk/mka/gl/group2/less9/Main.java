package sk.mka.gl.group2.less9;

public class Main {

    //    private static int increase(final int x) {
    private static int increase(int x) {
        int y = x++;
        return y;
    }

    private int addition(int a, int b) {
        return a + b;
    }

    private float addition(int x, int y, int z) {
        return x + y + z;
    }


    public static void main(String[] args) {
        int y = 10;

        System.out.println("y: " + y);
        increase(y);
        System.out.println("y: " + y);

        Picture a = new Picture();
        a.setName("A");
        Picture b = new Picture();
        b.setName("B");
        Picture c = new Picture();
        c.setName("C");

        System.out.println("number of pictures: " + Stand.NUMBER_OF_PICTURE);

        Stand x = new Stand();
        System.out.println("number of pictures: " + Stand.NUMBER_OF_PICTURE);

        Stand x1 = new Stand();
        System.out.println("x1_number of pictures: " + Stand.NUMBER_OF_PICTURE);

        Stand x2 = new Stand();
        System.out.println("x2_number of pictures: " + Stand.NUMBER_OF_PICTURE);


    }
}
