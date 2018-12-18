
import java.util.Scanner;

public class Main {

    /// halvna stranka
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("select which version you want to start");
        System.out.println("Press (1) for first version");
        System.out.println("Press (2) for second version");
        System.out.println("Press (3) for third version");

        int x = reader.nextInt();


        switch (x) {
            case 1:
                first();
            case 2:
                second();
            case 3:
                third();
            default:
                //ENGLISH please
                System.out.println("Nevybralis ste ani jednu z ponukanych moznosti");
                System.out.println("program sa ukonci...");
                break;
        }
    }


    //prvy pokus
    public static void first() {

        System.out.println("Vybral si si Program verzie 1.0");
        System.out.println("Musis zadat iba cisla v opacnom pripade program spadne !!!");
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = reader.nextInt();

        System.out.println("Enter a second number: ");
        int b = reader.nextInt();
        System.out.println("You enter following numbers: {" + a + "},{" + b + "}");
        System.out.println("Now I will tell you if your numbers are odd or even");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Press /Y/ if you want to see results otherwise program will end");
        String x = reader.next();
        System.out.println("You choose: " + x + " so...");

        if (x.equals("y") || x.equals("Y")) {
            System.out.println("...lets see...");
            if (a % 2 == 0) {
                System.out.println("your first number: {" + a + "} is Even.");
            } else {
                System.out.println("your first number: {" + a + "} is Odd.");
            }
            if (b % 2 == 0) {
                System.out.println("your first number: {" + b + "} is Even.");
            } else {
                System.out.println("your first number: {" + b + "} is Odd.");
            }
            System.out.println("...Thanks for playing with me, Bye.");

        } else {
            System.out.println(x);
            System.out.println("...program will close, Bye.");

        }
        reader.close();
    }

    // s overenim cisla
    public static void second() {

        System.out.println("Vybral si si Program verzie 2.0");
        Scanner reader = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        while (true) {
            System.out.println("Enter a number: ");
            String a = reader.next();
            try {
                firstNumber = Integer.parseInt(a);
                break;
            } catch (Exception e) {
                System.out.println("Nezadali ste cislo , skuste znova!");
            }
        }
        while (true) {
            System.out.println("Enter a second number: ");
            String b = reader.next();
            try {
                secondNumber = Integer.parseInt(b);
                break;
            } catch (Exception e) {
                System.out.println("Nezadali ste cislo , skuste znova!");
            }
        }
        System.out.println("You enter following numbers: {" + firstNumber + "},{" + secondNumber + "}");
        System.out.println("Now I will tell you if your numbers are odd or even");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Press /Y/ if you want to see results otherwise program will end");
        String x = reader.next();
        System.out.println("You choose: " + x + " so...");

        if (x.equals("y") || x.equals("Y")) {
            System.out.println("....lets see....");
            if (firstNumber % 2 == 0) {
                System.out.println("your first number: {" + firstNumber + "} is Even.");
            } else {
                System.out.println("your first number: {" + firstNumber + "} is Odd.");
            }
            if (secondNumber % 2 == 0) {
                System.out.println("your first number: {" + secondNumber + "} is Even.");
            } else {
                System.out.println("your first number: {" + secondNumber + "} is Odd.");
            }
            System.out.println("...Thanks for playing with me, Bye.");

        } else {
            System.out.println(x);
            System.out.println("...program will close, Bye.");
        }
        reader.close();
    }

    // s overenim cisla
    public static void third() {

        System.out.println("Vybral si si Program verzie 3.0");
        Scanner reader = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        int r = 0;

        while (true) {
            System.out.println("Enter a number: ");
            String a = reader.next();
            try {
                firstNumber = Integer.parseInt(a);
                r = 0;
                break;
            } catch (Exception e) {
                r++;
                if (r > 2) {
                    System.out.println("3x ste nezadaly spravny znak Program je unaveny a preto sa ukonci");
                    System.exit(0);
                } else {
                    System.out.println("Nezadali ste cislo , skuste znova!");
                }
            }
        }
        while (true) {
            System.out.println("Enter a second number: ");
            String b = reader.next();
            try {
                secondNumber = Integer.parseInt(b);
                r = 0;
                break;
            } catch (Exception e) {
                r++;
                if (r > 2) {
                    System.out.println("3x ste nezadaly spravny znak Program je unaveny a preto sa ukonci");
                    System.exit(0);
                } else {
                    System.out.println("Nezadali ste cislo , skuste znova!");
                }
            }
        }
        System.out.println("You enter following numbers: {" + firstNumber + "},{" + secondNumber + "}");
        System.out.println("Now I will tell you if your numbers are odd or even");
        System.out.println("+++++++++++++++++++++");
        System.out.println("Press /Y/ if you want to see results otherwise program will end");
        String x = reader.next();
        System.out.println("You choose: " + x + " so...");
        if (x.equals("y") || x.equals("Y")) {
            System.out.println("....lets see....");
            if (firstNumber % 2 == 0) {
                System.out.println("your first number: {" + firstNumber + "} is Even.");
            } else {
                System.out.println("your first number: {" + firstNumber + "} is Odd.");
            }
            if (secondNumber % 2 == 0) {
                System.out.println("your first number: {" + secondNumber + "} is Even.");
            } else {
                System.out.println("your first number: {" + secondNumber + "} is Odd.");
            }
            System.out.println("...Thanks for playing with me, Bye.");
        } else {
            System.out.println(x);
            System.out.println("...program will close, Bye.");
        }
        reader.close();
    }
}