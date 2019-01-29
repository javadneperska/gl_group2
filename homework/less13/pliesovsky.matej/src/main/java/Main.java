import java.util.ArrayList;

public class Main {
    private static String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop/";

    public static void main(String[] args) {
        ReadFUtils readFUtils = new ReadFUtils(",");
        ArrayList<String[]> fileData = readFUtils.readFile(DESKTOP_PATH + "input.csv");
        PersonEm[] personEms = new PersonEm[fileData.size()];
        for (int i = 0; i < fileData.size(); i++) {
            personEms[i] = new PersonEm(fileData.get(i));
        }
        PersonEm[] personSorter = UtilsE.sortBy(personEms, "stage");
        UtilsE.printLastNElementsReversed(personSorter, 3);
        StringBuilder dataToWrite = new StringBuilder();
        for (PersonEm personEm : UtilsE.sortBy(personEms, "surname")) {
            dataToWrite.append(personEm.toString()).append(System.getProperty("line.separator"));
        }

        readFUtils.writeToFile(DESKTOP_PATH + "output.txt", dataToWrite.toString());
    }

}
