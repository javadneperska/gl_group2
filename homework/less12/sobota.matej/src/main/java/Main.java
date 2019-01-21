import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String SAMPLE_CSV_FILE_PATH = "./cisla.csv";

        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVReader csvReader = new CSVReader(reader);

        List<String[]> records = csvReader.readAll();

        Compare find = new Compare();
        int i = 1;
        for (String[] record : records) {
            numberFirst = Integer.parseInt(record[0]);
            numberSecond = Integer.parseInt(record[1]);

    }

}
