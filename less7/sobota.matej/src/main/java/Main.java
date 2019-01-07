import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int aa = reader.nextInt();
        System.out.println("Enter second number: ");
        int bb = reader.nextInt();

        int a = 1;
        int b = 2;

        System.out.println("Sum of numbers is: " + (aa + bb + a + b));



    }


//    program ktory z externaho suboru nacita cisla (min 10 )v formate csv nasledne ich vypise scita ich vynasobi a zisti najvecsie a najmensie


    public static int breaker(){
        for (int i = 0; i < 5; i++) {
            if (i == 1){
                break;
            }
            System.out.println("i: "+ i);
        }
        return 1;
    }

    public static int continuer(){
        for (int i = 0; i < 5; i++) {
            if (i == 1){
                continue;
            }
            System.out.println("i: "+ i);
        }
        return 1;

    }


}
