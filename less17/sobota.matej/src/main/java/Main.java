import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] pole = new Integer[10];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = new Integer(i + 1);
            pole[i] = i*3;

        }
        System.out.println(Arrays.toString(pole));
    }
}
