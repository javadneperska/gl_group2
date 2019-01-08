import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;



public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Float> numbers = new ArrayList<Float>();
        float number;
        float min = 0;
        float max = 0;

        File file = new File("text.csv");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(",");
        System.out.println("Your numbers are: ");
        int i = 0;
        while(scanner.hasNext()){
            number = Float.valueOf(scanner.next());
            if (i==0){
                min = number;
                max = number;
                i = 1;
            }
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }

            numbers.add(number);
            System.out.print(number +" ");
        }
        scanner.close();

        System.out.println("");
        float sum = 0;
        for (float value : numbers) {
            sum += value;
        }
        System.out.println("Their sum is: " + sum);

        float mul = 1;
        for (float value : numbers) {
            mul = mul * value;
        }
        System.out.println("Their multiple is: " + mul);

        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);
        }
    }

//    program ktory z externaho suboru nacita cisla (min 10 )v formate csv nasledne ich vypise scita ich vynasobi a zisti najvecsie a najmensie

