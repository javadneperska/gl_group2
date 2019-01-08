import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    private static final String fileFormat = "csv";
    private static final String delimiter = ",";

    public static void main(String[] args) {
        ArrayList<String> fileList = getFileList(fileFormat);
        if (fileList == null){
            System.exit(-2);
        }
        if (fileList.isEmpty()) {
            System.out.println("No csv files were found");
            System.exit(-1);
        }
        for (String file : fileList) {
            double[] numbers = parseFile(file, delimiter);
            if (numbers == null) {
                continue;
            }
            double sum = 0;
            double product = 1;
            double min = numbers[0];
            double max = numbers[0];
            for (double number : numbers) {
                sum += number;
                product = product * number;
                if (min > number) {
                    min = number;
                }
                if (max < number) {
                    max = number;
                }
            }
            System.out.println("--------------------------");
            System.out.println(file);
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);
            System.out.println("--------------------------");
        }
        System.out.println("Program has finished");
    }

    /**
     * Method for parsing the file. File should contains numbers splitted by the delimiter
     *
     * @param fileName  Name of the file to parse
     * @param delimiter Delimiter, which splits numbers in the file
     * @return Double array with splitted numbers
     */
    private static double[] parseFile(String fileName, String delimiter) {
        BufferedReader fileReader;
        String line;
        StringBuilder numbersText = new StringBuilder();
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
                numbersText.append(line);
            }
        } catch (Exception e) {
            System.out.println("Error while parsing csv file");
            return null;
        }
        String[] content = numbersText.toString().split(delimiter);
        if (numbersText.length() == 0) {
            System.out.format("File %s is empty%n", fileName);
            return null;
        }
        double[] numbers = new double[content.length];
        for (int i = 0; i < content.length; i++) {
            try {
                numbers[i] = Double.parseDouble(content[i]);
            } catch (NumberFormatException e) {
                System.out.format("Unknown formatting inside of the %s file%n", fileName);
                return null;
            }
        }
        return numbers;
    }

    /**
     * Method for getting the file list with a given format from the root folder
     *
     * @param fileFormat format of the files that will be returned as list
     * @return The list of file names with a given format
     */
    private static ArrayList<String> getFileList(String fileFormat) {
        ArrayList<String> fileNames = new ArrayList<String>();
        File directory = new File(System.getProperty("user.dir"));
        try {
            for (File file : directory.listFiles()) {
                if (file.getName().endsWith(fileFormat)) {
                    fileNames.add(file.getName());
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Please, specify the file format");
            return null;
        }
        return fileNames;
    }
}