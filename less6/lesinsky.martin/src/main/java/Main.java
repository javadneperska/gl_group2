import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Jednoduchy matematicky program");
        System.out.println("+----------------------------+");
        System.out.println("1. nasobenie");
        System.out.println("2. delenie");
        System.out.println("3. odpocitavanie");
        System.out.println("+----------------------------+");

        int x = reader.nextInt();

        System.out.println("Vybrali ste si: " + x);
        System.out.println("+----------------------------+");

        System.out.println("Enter first number: ");
        double firstNumber = reader.nextDouble();
        System.out.println("Enter a second number: ");
        double secondNumber = reader.nextDouble();
        System.out.println("You enter following numbers: {" + firstNumber + "},{" + secondNumber + "}");
        switch (x) {

            case 1:
                double a = firstNumber * secondNumber;
                System.out.println("vysledok nasobenia je: " + a);
                break;
            case 2:
                double b = firstNumber / secondNumber;
                System.out.println("vysledok delenia je: " + b);
                break;
            case 3:
                double c = firstNumber - secondNumber;
                System.out.println("vysledok odpocitavania je: " + c);
                break;
            default:
                //ENGLISH please
                System.out.println("You haven't choose any of provided options. ");
                System.out.println("program will terminate...");
                break;
        }
    }
}
