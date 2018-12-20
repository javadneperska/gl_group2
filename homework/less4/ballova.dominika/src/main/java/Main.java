import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        //with for
        while (true) {

            System.out.print("Enter the number: ");
            int number = keyboard.nextInt();
            if (number == 0){
                break;
            }
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even." + "\n");
            } else {
                System.out.println("The number " + number + " is odd."  + "\n");
            }
//            System.out.println("");
            System.out.println("**********************"  + "\n");
        }



    }
}
