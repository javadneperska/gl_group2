import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What do you want?");
        System.out.println("For multiply please enter 1");
        System.out.println("For divide please enter 2");
        System.out.println("For minus please enter 3");
        System.out.println("Enter your choise for operation with two numbers: ");

        int choise = keyboard.nextInt();
        System.out.println("Enter the first number: ");
        float num1 = keyboard.nextFloat();
        System.out.println("Enter the second number: ");
        float num2 = keyboard.nextFloat();

        float result = 0;
        String operation = "unknown";

        switch(choise) {
            case 1 : {
                result = num1 * num2;
                operation = "multiply";
            }
            break;
            case 2 : {
                result = num1 / num2;
                operation = "divide";
            }
            break;
            case 3 : {
                result = num1 - num2;
                operation = "minus";
            }
            break;
        }

        System.out.println("Result is: " + result);
        keyboard.close();
    }
}
