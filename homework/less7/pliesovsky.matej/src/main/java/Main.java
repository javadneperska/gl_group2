import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fileName = "numbers.csv";
        File file = new File(fileName);
        int sum = 0;
        int sum1 = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String numbers = input.next();
                System.out.println(numbers);

                sum = sum + Integer.parseInt(numbers);
                sum1 = sum * Integer.parseInt(numbers);

                if (Integer.parseInt(numbers) > max) {
                    max = Integer.parseInt(numbers);
                }

                if (Integer.parseInt(numbers) < min) {
                    min = Integer.parseInt(numbers);
                }

            }
            System.out.println("******************");
            System.out.println("sum: " + sum); //sum of counting of all numbers
            System.out.println("sum1: " + sum1); //sum of multiplying of all numbers
            System.out.println("Min number is: " + min); //lowest number in file
            System.out.println("Max number is: " + max); //highest number in file


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
