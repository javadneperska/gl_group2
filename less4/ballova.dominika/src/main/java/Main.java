import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // this is example of skrateny logicky sucin
        int x = 3;
        int y = 7;
        int z = -1;

        if (x == 3 && y == 7 && z == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

// this is modulo example
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i: " + i + " je parne");
            } else {
                System.out.println("i: " + i + " je neparne");
            }
        }

        {
            int i = -1234;
            System.out.format("i = %-7ahoj%n", i);


            Scanner sc = new Scanner(System.in);

        }

    }
}
