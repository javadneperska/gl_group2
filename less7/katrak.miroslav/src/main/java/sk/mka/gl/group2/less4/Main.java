package sk.mka.gl.group2.less4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double firstNumber = sc.nextDouble();
        System.out.println("v: " + firstNumber);

        double secondNumber = sc.nextDouble();
        System.out.println("v1: " + secondNumber);

        double sum = firstNumber + secondNumber;
        System.out.println("sum: " + sum);


        double h1 = 2;
        double h2 = 3;
        double sum2 = h1 + h2;

        System.out.println("sum2:" + sum2);

        System.out.println("final_sum: " + (sum + sum2));

    }

}
