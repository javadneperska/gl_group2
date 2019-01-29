public class UtilsE {

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
