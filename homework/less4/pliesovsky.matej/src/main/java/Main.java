import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        Scanner keyboard = new Scanner(System.in);
        int firstint = keyboard.nextInt();
        if (firstint % 2 == 0) {
            System.out.println("First number " + firstint + " is even.");
        } else {
            System.out.println("First number " + firstint + " is odd.");
        }

        System.out.print("Enter second number: ");
        int secondtint = keyboard.nextInt();
        if (secondtint % 2 == 0) {
            System.out.println("Second number " + secondtint + " is even.");
        } else {
            System.out.println("Second number " + secondtint + " is odd.");
        }
    }

}
