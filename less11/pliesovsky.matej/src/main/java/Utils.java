import java.util.Arrays;

public class Utils {
    public static void printArray(String msg, int[] a){
        String str =Arrays.toString(a);
        System.out.println(msg + ":" + str);
    }
}
