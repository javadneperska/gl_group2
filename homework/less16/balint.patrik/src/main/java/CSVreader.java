import java.io.*;
import java.util.ArrayList;

public class CSVreader {

    public CSVreader(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }

    public void setDelimiter(String delimiter) {
        this.delimiter = delimiter;
    }

    private String delimiter;

    public ArrayList<String[]> readFile(String fileName) {
        BufferedReader fileReader;
        String line;
        ArrayList<String[]> content = new ArrayList<String[]>();
        try {
            fileReader = new BufferedReader(new FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
                content.add(line.split(delimiter));
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("CSV file was not found.");
            System.exit(-1);
        } catch (
                IOException e) {
            System.out.println("IO error.");
            System.exit(-2);
        }

        return content;
    }

    public void writeToFile(String fileName, String content){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            System.out.println("File can't be written");
            System.exit(-4);
        }
    }

}
