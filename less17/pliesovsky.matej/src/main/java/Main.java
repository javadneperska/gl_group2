import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // pole desiatich integerov
        Integer[] field = new Integer[10];

        for (int i = 0; i < field.length; i++) {
            field[i] = new Integer(i+1);
            field[i] = i*5;
        }
        System.out.println(Arrays.toString(field));
    }
}
