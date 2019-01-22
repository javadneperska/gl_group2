import utilities.FileReader;
import utilities.FileSearcher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileSearcher.setFileFormat("csv"); // zadas format file, ktory chces vyhladat ..
        ArrayList<String> fileList = FileSearcher.getFileList();  // dostanes ten zoznam filov s formatom ktory si zadal
        FileReader fileReader = new FileReader(",");  // instancna metoda ...
        for (String file : fileList) {
            ArrayList<double[]> digits_pairs = fileReader.readFile(file);
            if (digits_pairs == null){
                System.exit(-1);
            }
            double max_sum = 0;
            double min_sum = 0;
            System.out.println("******************");
            System.out.println(file);
            System.out.println("******************");
            for (double[] pair : digits_pairs){
                if (pair[0] > pair[1]){
                    max_sum += pair[0];
                    min_sum += pair[1];
                    System.out.printf("Number %f is bigger than %f%n", pair[0], pair[1]);
                } else {
                    max_sum += pair[1];
                    min_sum += pair[0];
                    System.out.printf("Number %f is bigger than %f%n", pair[1], pair[0]);
                }
            }
            System.out.printf("Sum of max: %f, sum of min: %f%n", max_sum, min_sum);
        }
    }
}
