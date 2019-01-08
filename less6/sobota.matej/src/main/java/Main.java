import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        System.out.println("What do you want to do?");
        System.out.println("1 - multiply");
        System.out.println("2 - divide");
        System.out.println("3 - substract");
        System.out.println("Please enter your choice: ");
        int operation = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Please enter first number: ");
        float first = reader.nextFloat();
        System.out.println("Please enter second number: ");
        float second = reader.nextFloat();

        float result = 0;
        String opString = "unknown";
        switch(operation) {
            case 1 : {
                result = first * second;
                opString = "multiplying";
            }
            break;
            case 2 : {
                result = first / second;
                opString = "dividing";
            }
            break;
            case 3 : {
                result = first - second;
                opString = "substracting";
            }
            break;
        }


        System.out.println("Result of " + opString + " with numbers " + first + " and " + second + " is: " + result);

        reader.close();
    }

}
