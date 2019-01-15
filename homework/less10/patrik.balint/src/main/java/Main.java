import utilities.FileReader;
import utilities.FileSearcher;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileSearcher.setFileFormat("csv");
        ArrayList<String> fileList = FileSearcher.getFileList();
        FileReader fileReader = new FileReader(",");
        for (String file : fileList) {
            ArrayList<double[]> digits_pairs = fileReader.readFile(file);
            if (digits_pairs == null){
                System.exit(-1);
            }
            double max_sum = 0;
            double min_sum = 0;
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
            System.out.printf("In file : %s - there is sum of MAX: %f and sum of MIN: %f%n", file, max_sum, min_sum);
        }
    }
}
