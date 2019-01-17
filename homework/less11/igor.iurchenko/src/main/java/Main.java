import utilities.FileReader;
import utilities.FileSearcher;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FileSearcher.setFileFormat("csv");
        ArrayList<String> fileList = FileSearcher.getFileList();
        FileReader fileReader = new FileReader(",");
        ArrayList<double[]> fields = new ArrayList<double[]>();
        for (String file : fileList) {
            fields.add(fileReader.readFile(file));
            System.out.printf("Summ of field from file - %s: %f %n", file, fieldSumm(fields.get(fields.size() - 1)));
            System.out.println(Arrays.toString(fields.get(fields.size() - 1)));
            Arrays.sort(fields.get(fields.size() - 1));
            System.out.printf("Sorted list: %s%n", Arrays.toString(fields.get(fields.size() - 1)));
        }

        double[] sumField = new double[fields.get(fields.size() - 1).length];

        for (int i = 0; i < sumField.length; i++) {
            sumField[i] = fields.get(fields.size() - 1)[i] + fields.get(fields.size() - 2)[i];
        }

        System.out.printf("Summ list: %s%n", Arrays.toString(sumField));
    }

    private static double fieldSumm(double[] field) {
        double sum = 0;

        for (double digit :
                field) {
            sum += digit;
        }
        return sum;
    }
}
