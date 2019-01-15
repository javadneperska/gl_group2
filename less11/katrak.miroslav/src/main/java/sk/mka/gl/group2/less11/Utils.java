package sk.mka.gl.group2.less11;


import java.util.Arrays;

public class Utils {

    public static void printArray(String msg, int[] a){
        final String toString = Arrays.toString(a);
        System.out.println(msg + ":" + toString);
    }
}
