import java.util.Arrays;

public class Utils {

    public static void printArray(String msg, int[] a) {

        final String toString = Arrays.toString(a);
        System.out.println(msg + " Array:" + toString);
    }
}
