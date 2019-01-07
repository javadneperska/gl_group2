import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // kalkulacka ktora sa opyta ci chces nasobenie delenie alebo odpocitavanie
        // poziada o vlozenie 2 cisel
        // urobi vypocet
        // pouzite funkciu switch

        System.out.println("Select mathematic operation:");
        System.out.println("----------------------------");
        System.out.println("1. multiplication");
        System.out.println("2. division");
        System.out.println("3. subtraction");

        Scanner reader = new Scanner(System.in);
        int x = reader.nextInt();
        System.out.println("You choose:" + x);

        System.out.println("Write first number:");
        double y = reader.nextDouble();
        System.out.println("Write second number:");
        double z = reader.nextDouble();
        System.out.println("You choose:" + y + " " + z);


    }

}

