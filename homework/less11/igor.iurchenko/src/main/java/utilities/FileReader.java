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

    public double[] readFile(String fileName) {
        BufferedReader fileReader;
        String[] line;
        double[] content;
        try {
            fileReader = new BufferedReader(new java.io.FileReader(fileName));
            line = fileReader.readLine().split(m_delimiter);
            content = new double[line.length];
            for (int i = 0; i < line.length; i++) {
                content[i] = Double.parseDouble(line[i]);
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File was not found");
            return null;
        } catch (
                IOException e) {
            System.out.println("IO error");
            return null;
        }

        return content;
    }

}
