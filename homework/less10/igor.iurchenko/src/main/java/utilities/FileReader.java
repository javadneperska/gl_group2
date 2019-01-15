package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class FileReader {
    public FileReader(String delimiter) {
        m_delimiter = delimiter;

    }

    public static String get_delimiter() {
        return m_delimiter;
    }


    private static String m_delimiter;

    public ArrayList<double[]> readFile(String fileName) {
        BufferedReader fileReader;
        String line;
        ArrayList<double[]> content = new ArrayList<double[]>();
        try {
            fileReader = new BufferedReader(new java.io.FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
                String[] numbersString = line.split(m_delimiter);
                if (numbersString.length == 2) {
                    content.add(new double[numbersString.length]);
                } else {
                    System.out.println("Number of digits on the line is not 2");
                    continue;
                }
                for (int i = 0; i < numbersString.length; i++) {
                    content.get(content.size() - 1)[i] = Double.parseDouble(numbersString[i]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
            return null;
        } catch (IOException e) {
            System.out.println("IO error");
            return null;
    }

        return content;
}

}
