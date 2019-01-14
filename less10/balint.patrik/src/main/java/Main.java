import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Max value is : " + maxValue());
            System.out.println("If you want to close comparing two numbers, please enter 'y' character");
        } while (sc.next().equals("y"));
    }

    private static int maxValue(){
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Please enter first number:");
        a = sc.nextInt();
        System.out.println("Please enter second number:");
        b = sc.nextInt();
        return a > b ? a : b;
    }
}
