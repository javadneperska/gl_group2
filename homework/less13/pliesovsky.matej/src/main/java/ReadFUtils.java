import java.io.*;
import java.util.ArrayList;

public class ReadFUtils {
    public ReadFUtils(String delimiter) {
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
            fileReader = new BufferedReader(new java.io.FileReader(fileName));
            while ((line = fileReader.readLine()) != null) {
                content.add(line.split(delimiter));
            }
        } catch (
                FileNotFoundException e) {
            System.out.println("File was not found");
            System.exit(-1);
        } catch (
                IOException e) {
            System.out.println("IO error");
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

    public static PersonEm[] sortBy(PersonEm[] personEms, String sorting) {
        PersonEm[] sortedList = personEms.clone();
        int n = sortedList.length;
        PersonEm temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (sorting.equals("stage")) {
                    if (sortedList[j - 1].getStage() > sortedList[j].getStage()) {
                        temp = sortedList[j - 1];
                        sortedList[j - 1] = sortedList[j];
                        sortedList[j] = temp;
                    }
                } else if (sorting.equals("surname")) {
                    if (sortedList[j - 1].getLastName().compareToIgnoreCase(sortedList[j].getLastName()) > 0) {
                        temp = sortedList[j - 1];
                        sortedList[j - 1] = sortedList[j];
                        sortedList[j] = temp;

                    }
                } else {
                    System.out.println("Not implemented");
                }

            }
        }
        return sortedList;
    }

    public static void printLastNElementsReversed(PersonEm[] personEm, int numberOfElements) {
        int lastElementIndex = numberOfElements > personEm.length ? 0 : personEm.length - (numberOfElements + 1);
        for (int i = personEm.length - 1; i > lastElementIndex; i--) {
            personEm[i].printEmployee();
        }

    }

}
