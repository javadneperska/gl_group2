package sk.gl.group2.less13hometask;

public class EmployeeUtility {

    public static Employee[] sortBy(Employee[] employees, String sorting) {
        Employee[] sortedList = employees.clone();
        int n = sortedList.length;
        Employee temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (sorting.equals("stage")) {
                    if (sortedList[j - 1].getStage() > sortedList[j].getStage()) {
                        temp = sortedList[j - 1];
                        sortedList[j - 1] = sortedList[j];
                        sortedList[j] = temp;
                    }
                } else if (sorting.equals("surname")) {
                    if (sortedList[j - 1].getSurname().compareToIgnoreCase(sortedList[j].getSurname()) > 0) {
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

    public static void printLastNElementsReversed(Employee[] employee, int numberOfElements) {
        int lastElementIndex = numberOfElements > employee.length ? 0 : employee.length - (numberOfElements + 1);
        for (int i = employee.length - 1; i > lastElementIndex; i--) {
            employee[i].printEmployee();
        }

    }

}
