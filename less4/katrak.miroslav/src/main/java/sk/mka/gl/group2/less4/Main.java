package sk.mka.gl.group2.less4;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int x = 3;
        int y = 7;
        int z = -1;

        //this is example of skrateny logicky sucin
        if (x == 3 && y == 7 && z == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //this is modulo example
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i: " + i + " je parne");
            } else
                System.out.println("i: " + i + " je neparne");
        }

        int i = -1234;
        System.out.format("i = %-12ahoj%n", i);*/


        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int myint = keyboard.nextInt();
        System.out.println("myint: " + myint);



    }
}
