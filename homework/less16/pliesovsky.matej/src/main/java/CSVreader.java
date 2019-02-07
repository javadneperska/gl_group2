import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CSVreader {

    public static ArrayList<String[]> readFile() {
        String file = "src/main/resources/humans.csv";
//        ArrayList<String[]> content = new ArrayList<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            Human[] fieldHuman = new Human[10];

            while ((line = br.readLine()) != null) {
                String[] fieldLine = line.split(",");
                Human human = new Human(fieldLine[0], fieldLine[1], fieldLine[2]);
                int rL = 0;
                fieldHuman[rL] = human;
                rL++;
                System.out.println(human);
            }

        //line counter
            long countOfLines = Files.lines(Paths.get(new File("src/main/resources/humans.csv").getPath())).count();
            System.out.println(String.format("There are %s lines in the document", countOfLines));
            System.out.println(" ");




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

}
