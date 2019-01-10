import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Do you want to compare two numbers? [Y/N]: ");
        String operation = reader.nextLine();
        while (operation == "Y"){
            System.out.println("Please enter first number: ");
            int first = reader.nextInt();
            System.out.println("Please enter second number: ");
            int second = reader.nextInt();

            


        }




    }
    static int max(int a, int b){
        if (a > b){
            return(a);
        }
        else return (b);

    }

}