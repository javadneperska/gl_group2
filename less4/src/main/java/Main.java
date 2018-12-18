import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in

        System.out.println("You will be now asked to enter two number and i will tell you if they are odd or even");
        System.out.println("Enter first number: ");
        int first = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("Enter second number: ");
        int second = reader.nextInt();

        if ((first % 2) == 0){
            System.out.println("First number " + first + " is even");
        }
        else{
            System.out.println("First number " + first + " is odd");
        }

        if ((second % 2) == 0){
            System.out.println("First number " + second + " is even");
        }
        else{
            System.out.println("First number " + second + " is odd");
        }
        //once finished
        reader.close();
    }

}

