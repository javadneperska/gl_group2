import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //with for
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter the number: ");
            Scanner keyboard = new Scanner(System.in);
            int firstNumber = keyboard.nextInt();
            if (firstNumber % 2 == 0) {
                System.out.println("The number " + firstNumber + " is even." + "\n");
            } else {
                System.out.println("The number " + firstNumber + " is odd." + "\n");
            }
//            System.out.println("");
            System.out.println("**********************" + "\n");
        }

    }
}