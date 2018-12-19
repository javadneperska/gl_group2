import java.util.Scanner;

public class Main {
    private static final int SUM = 1;
    private static final int DIVISION = 2;
    private static final int SUBTRACTION = 3;
    private static final int QUANTITY = 2;


    public static void main(String[] args) {
        System.out.println("Make your choice");
        System.out.format("1 - sum%n2 - division%n3 - subtraction%n");
        Scanner line = new Scanner(System.in);
        float[] numbers;
        String template = "%.2f is the result of %s%n";
        switch (line.nextInt()) {
            case SUM:
                numbers = getUserNumbers(QUANTITY);
                System.out.format(template, numbers[0] + numbers[1], "summing");
                break;
            case DIVISION:
                numbers = getUserNumbers(QUANTITY);
                System.out.format(template, numbers[0] / numbers[1], "division");
                break;
            case SUBTRACTION:
                numbers = getUserNumbers(QUANTITY);
                System.out.format(template, numbers[0] - numbers[1], "subtraction");
                break;
            default:
                System.out.println("Your choice must be in range 1-3");
                break;
        }

    }


    private static float[] getUserNumbers(int quantity) {
        float[] userNumbers = new float[quantity];
        Scanner line = new Scanner(System.in);
        for (int i = 0; i < userNumbers.length; i++) {
            if (i != 0) {
                System.out.println("Provide the next number");
            } else {
                System.out.printf("Provide the %snumber%n", (quantity == 1) ? "" : "first ");
            }
            userNumbers[i] = line.nextFloat();
        }
        return userNumbers;
    }
}
