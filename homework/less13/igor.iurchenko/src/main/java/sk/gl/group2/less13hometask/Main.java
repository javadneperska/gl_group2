package sk.gl.group2.less13hometask;

import java.util.ArrayList;

public class Main {
    private static String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop/";

    public static void main(String[] args) {
        FileUtility fileUtility = new FileUtility(",");
        ArrayList<String[]> fileContent = fileUtility.readFile(DESKTOP_PATH + "input.csv");
        Employee[] employees = new Employee[fileContent.size()];
        for (int i = 0; i < fileContent.size(); i++) {
            employees[i] = new Employee(fileContent.get(i));
        }
        Employee[] sortedByStageEmploees = EmployeeUtility.sortBy(employees, "stage");
        EmployeeUtility.printLastNElementsReversed(sortedByStageEmploees, 3);
        StringBuilder contentToWrite = new StringBuilder();
        for (Employee employee : EmployeeUtility.sortBy(employees, "surname")) {
            contentToWrite.append(employee.toString()).append(System.getProperty("line.separator"));
        }

        fileUtility.writeToFile(DESKTOP_PATH + "output.txt", contentToWrite.toString());
    }

}
