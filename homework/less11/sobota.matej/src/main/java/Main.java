import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int[] a = new int[6];
        int[] b = new int[6];


        Scanner scanner = new Scanner(new File("a.csv"));
        scanner.useDelimiter(",");
        for (int i = 0; i < 6; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        scanner.close();

        Scanner scanner1 = new Scanner(new File("b.csv"));
        scanner1.useDelimiter(",");
        for (int i = 0; i < 6; i++) {
            b[i] = Integer.parseInt(scanner1.next());
        }
        scanner1.close();


        Utils.printArray("before sort a", a);
        Arrays.sort(a);
        Utils.printArray("after sort a", a);
        int sumA = sumArray(a);
        System.out.println("sumA: " + sumA);


        Utils.printArray("before sort b", b);
        Arrays.sort(b);
        Utils.printArray("after sort b", b);
        int sumB = sumArray(b);
        Utils.printArray("po b", b);

    }


    private static int sumArray(int[] b) {
        int sumB = 0;
        for (int hodnota : b) {
            sumB += hodnota;
        }
        return sumB;
}
}
