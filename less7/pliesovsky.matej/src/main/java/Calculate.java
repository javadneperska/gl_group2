import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("v: " + num1);

        double num2 = sc.nextDouble();
        System.out.println("v1: " + num2);

        double sum = num1 + num2;
        System.out.println("sum: " + sum);

        double h1 = 2;
        double h2 = 3;
        double sum2 = h1 + h2;

        System.out.println("sum2: " + sum2);

        double sum3 = sum + sum2;
        System.out.println("sum3:" + sum3);

    }
}
