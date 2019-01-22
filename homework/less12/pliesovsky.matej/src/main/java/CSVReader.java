import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<Person> readPeople() throws IOException {
        int count = 0;
        String file = "src/main/resources/listOfP.csv";
        List<Person> people = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                Person person = new Person(line.split(","));
                people.add(person);
            }
        } catch (FileNotFoundException e) {
            //Some error logging
        }
        return people;
    }
}
