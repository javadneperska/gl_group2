import java.util.Scanner;

public class Main {
    private static final int QUANTITY = 2;

    public static void main(String[] args) {
        System.out.printf("Please provide %d int number%s%n", QUANTITY, (QUANTITY == 1) ? "" : "s");
        for (int number : getNumbers(QUANTITY)) {
            printOddOrEven(number);
        }
    }

    /**
     * Getting integer numbers from the user
     *
     * @param quantitty Quantity of numbers to get from user input
     * @return array of Integers
     */
    private static int[] getNumbers(int quantitty) {
        int[] numbers = new int[quantitty];
        for (int i = 0; i < quantitty; i++) {
            if (i != 0) {
                System.out.println("Provide the next number");
            } else {
                System.out.printf("Provide the %snumber%n", (quantitty == 1) ? "" : "first ");
            }
            numbers[i] = getAndValidateInput();
        }
        return numbers;

    }

    /**
     * Printing out if given integer is odd or even
     *
     * @param number Integer which should be checked for parity
     */
    private static void printOddOrEven(int number) {
        System.out.printf("Number: %d is %s%n", number, (number % 2 == 0) ? "odd" : "even");
    }

    /**
     * This method is aimed to check if provided number is integer on not
     *
     * @return Integer, provided by the user
     */
    private static int getAndValidateInput() {
        Scanner line = new Scanner(System.in);
        while (!line.hasNextInt()) {
            System.out.println("Please, provide integer");
            line = new Scanner(System.in);
        }
        return line.nextInt();

    }

}
