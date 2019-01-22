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

    public ArrayList<String[]> readFile(String fileName) {
        BufferedReader fileReader;
        String line;
        ArrayList<String[]> content = new ArrayList<String[]>();
        try {
            fileReader = new BufferedReader(new java.io.FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
                content.add(line.split(m_delimiter));
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
