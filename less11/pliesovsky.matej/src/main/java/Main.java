import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //vytvorit dve polia s 5timi prvkami a scitat ich
        int[] a = {3, 8, 11, 4, 6, 11};
        int[] b = {1, 2, 3, 5, 7, 11};

//        Utils.printArray("pred_a", a);
        int sumA = sumArray(a);
        Arrays.sort(a);
        Utils.printArray("po_a", a);
        System.out.println("sumA: " + sumA);
//        Utils.printArray("pred_b", b);
        int sumB = sumArray(b);
        Arrays.sort(b);
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
