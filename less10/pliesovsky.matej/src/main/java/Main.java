import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int IntCompare = new IntCompare();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        int a = keyboard.nextInt();

        System.out.println("Enter your second string: ");
        int b = keyboard.nextInt();

        // Call compareStrings
//        compareStrings();
        IntCompare compare = new IntCompare();
        compare.compareInts(a, b);
    }
}


class IntCompare {
    String a = "";
    String b = "";


    // Create method to compare them, to be called in StringCompareTest
    public static void compareInts(int a, int b) {
        if (a.compareTo(b) > 0)
            System.out.println("The first string is greater than the second.");
        else if (a.compareTo(b) < 0)
            System.out.println("The first string is smaller than the second.");
        else
            System.out.println("Both the strings are equal.");

        }
    }

