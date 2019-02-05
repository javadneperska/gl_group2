import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CSVreader {
    public static ArrayList<String[]> readFile() {
        String file = "src/main/resources/humans.csv";
        ArrayList<String[]> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                content.add(line.split(","));
            }
            //line counter
            long countOfLines = Files.lines(Paths.get(new File("src/main/resources/humans.csv").getPath())).count();
            System.out.println(String.format("There are %s lines in the document", countOfLines));
            System.out.println(" ");

        } catch (FileNotFoundException e) {
            //Some error logging
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }
}
