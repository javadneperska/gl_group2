import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        int[] a = new int[6];
        int[] b = new int[6];
        int i = 0;

        Scanner scanner = new Scanner(new File("src/main/resources/pole1.csv"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            a[i] = Integer.parseInt(scanner.next());
            i++;
        }
        scanner.close();

        i = 0;
        Scanner scanner1 = new Scanner(new File("src/main/resources/pole2.csv"));
        scanner1.useDelimiter(",");
        while(scanner1.hasNext()){
            b[i] = Integer.parseInt(scanner1.next());
            i++;
        }
        scanner1.close();

//
        Utils.printArray("before sort a", a);
        Arrays.sort(a);
        Utils.printArray("after sort a", a);
        int sumA = sumArray(a);
        System.out.println("sumA: " + sumA);


        Utils.printArray("before sort b", b);
        Arrays.sort(b);
        Utils.printArray("after sort b", b);
        int sumB = sumArray(b);
        System.out.println("sumB: " + sumB);


    }


    private static int sumArray(int[] b) {
        int sumB = 0;
        for (int hodnota : b) {
            sumB += hodnota;
        }
        return sumB;

    }
}
