import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Simple calculator to sum, subtract, multiply and divide the two numbers.
        */
        Scanner sc = new Scanner(System.in);

        // User input option selection
        System.out.println("Please, select the mathematical operation you want to do:");
        System.out.println("To sum the numbers, please select option 1.");
        System.out.println("To subtract the numbers, please select option 2.");
        System.out.println("To multiply the numbers, please select option 3.");
        System.out.println("To divide the numbers, please select option 4.");
        System.out.println("Please, select operation number to continue:");
        int userChoice = sc.nextInt();

        // User numbers input
        System.out.println("Please, enter the first number: ");
        float firstNumber = sc.nextFloat();
        System.out.println("Please, enter the second number: ");
        float secondNumber = sc.nextFloat();

        // Variables
        float result = 0;
        String operation = "";

        // Calculator operations
        switch(userChoice) {
            case 1 : {
                result = firstNumber + secondNumber;
                operation = "sum";
            }
            break;
            case 2 : {
                result = firstNumber - secondNumber;
                operation = "subtract";
            }
            break;
            case 3 : {
                result = firstNumber * secondNumber;
                operation = "multiply";
            }
            break;
            case 4 : {
                result = firstNumber / secondNumber;
                operation = "divide";
            }
            break;
        }

        // Print the result of the mathematical operation
        System.out.println("The result of " + operation + " is: " + result);
        sc.close();
    }
}