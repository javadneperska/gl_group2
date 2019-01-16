package sk.mka.gl.group2.less11;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {3, 8, 11,4, 6, 12};
        int[] b = {1, 2, 3, 5, 7, 11};

        Arrays.sort(a);
        Utils.printArray("po_sortovani_a", a);
        int sumA = sumArray(a);
        Utils.printArray("po_a", a);

        System.out.println("sumA: " + sumA);
        Arrays.sort(b);
        Utils.printArray("po_sortovani_b", b);
        int sumB = sumArray(b);
        Utils.printArray("po_b", b);

        System.out.println("sum_together: " + (sumA + sumB));
    }

    private static int sumArray(int[] b) {
        int sumB = 0;
        for (int hodnota : b) {
            sumB += hodnota;
        }
        return sumB;
    }
}