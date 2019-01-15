import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CSVReader {

    public ArrayList<Integer[]> printData() {
        String fileName = "src/main/resources/numbers.csv";
        ArrayList<Integer[]> items = new ArrayList<Integer[]>();
        FileReader fr = null;
        BufferedReader br = null;
        int i;

        try {
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ",");
                i = 0;
                Integer item[] = new Integer[2];

                while (st.hasMoreTokens()) {
                    String token = st.nextToken();

                    if (i == 0) {
                        item[0] = Utils.getInteger(token);
                    } else if (i == 1) {
                        item[1] = Utils.getInteger(token);
                    }

                    i++;
                }

                items.add(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }


        return items;
    }
}
