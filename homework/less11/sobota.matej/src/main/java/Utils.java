import java.util.Arrays;

public class Utils {

    public static void printArray(String msg, int[] a){
        String s = Arrays.toString(a);
        System.out.println(msg + ":" + s);
    }
}