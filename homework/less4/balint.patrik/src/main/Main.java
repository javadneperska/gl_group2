import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *   Detects if user's input number is ODD or EVEN
        *
         */
        for (int i = 0; i < 2; i++) {
            System.out.print("*************************************************" + "\n");
            System.out.print("Please, enter number to detect if is ODD or EVEN:");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number you entered: " + number + " is even.");
            } else {
                System.out.println("The number you entered: " + number + " is odd.");
            }
            System.out.print("*************************************************");
        }
    }
}
