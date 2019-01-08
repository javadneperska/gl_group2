import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Integer;
import java.lang.System;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // Read CSV File.
        Integer[] numbers = readNumbersFromCSVFile();
        Integer sumOfNumbers = sumOfNumbers(numbers);
        Integer minNumberFromAll = minNumber(numbers);
        Integer maxNumberFromAll = maxNumber(numbers);

        // Print all numbers read from CSV file, SUM, MIN and MAX values.
        System.out.println("**************************************");
        System.out.println("Numbers read from CSV file:");
        printIntFromCSV(numbers);
        System.out.println("**************************************");
        System.out.println("Sum of numbers is:\n" + sumOfNumbers);
        System.out.println("**************************************");
        System.out.println("MIN number is:\n" + minNumberFromAll);
        System.out.println("**************************************");
        System.out.println("MAX number is:\n" + maxNumberFromAll);
        System.out.println("**************************************");
    }

    private static Integer[] readNumbersFromCSVFile() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("Numbers.csv"));
            String line = null;

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");

                for (int i = 0; i < tokens.length; i++) {
                    numbers.add(Integer.parseInt(tokens[i].trim()));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }

        return numbers.toArray(new Integer[0]);
    }

    private static void printIntFromCSV(Integer[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
    }

    private static Integer sumOfNumbers(Integer[] numbers) {
        Integer sum = 0;

        for (int i=0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    private static Integer minNumber(Integer[] numbers) {

        Integer min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            min = (numbers[i] < min) ? numbers[i] : min;
        }
        return min;
    }

    private static Integer maxNumber(Integer[] numbers) {

        Integer max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            max = (numbers[i] > max) ? numbers[i] : max;
        }
        return max;
    }

}
