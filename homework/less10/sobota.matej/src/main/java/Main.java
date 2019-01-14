import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import com.opencsv.CSVReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int numberFirst = 0;
        int numberSecond = 0;

        int maximal = 0;
        int minimal = 0;

        int max = 0;
        int min = 0;

        String SAMPLE_CSV_FILE_PATH = "./cisla.csv";


        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVReader csvReader = new CSVReader(reader);

        List<String[]> records = csvReader.readAll();

        Compare find = new Compare();
        int i = 1;
        for (String[] record : records) {
            numberFirst = Integer.parseInt(record[0]);
            numberSecond = Integer.parseInt(record[1]);

            max = find.findMaximal(numberFirst, numberSecond);
            min = find.findMinimal(numberFirst, numberSecond);

            maximal += max;
            minimal += min;

            System.out.print("Numbers of row #" + i + " are: " + numberFirst + "," + numberSecond + " ");
            System.out.println(",while " + max + " is greater than " + min);

            i++;
        }
        System.out.println("Sum of greater numbers is: "+ maximal);
        System.out.println("Sum of lesser numbers is: " + minimal);


        }
    }



