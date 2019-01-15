import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int [] b = {6,7,8,9,0};
        int[] c = new int [5];

        for (int i = 0; i < 5; i++) {
            c[i] = a[i] + b[i];
        }

        String s = Arrays.toString(c);
        System.out.println("pole: " + s);



    }
}
