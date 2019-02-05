import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        CSVreader newCSV = new CSVreader();
        ArrayList<String[]> csvItems = CSVreader.readFile();
        for (int i=0; i < csvItems.size(); i++)
        {
            System.out.println(csvItems.get(i)[0] + " " + csvItems.get(i)[1] +  " " +  csvItems.get(i)[2]);
        }
    }
}
