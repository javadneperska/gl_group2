import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CSVReader newCSV = new CSVReader();
        int maxFromAll = Integer.MIN_VALUE;
        int minFromAll = Integer.MAX_VALUE;
        int sumFromAllMin = 0;
        int sumFromAllMax = 0;

        ArrayList<Integer[]> margins = newCSV.printData();

        // Iterating
        for (Integer[] aint : margins) {
            int min = MaxMinComparator.min(aint[0], aint[1]);
            int max = MaxMinComparator.max(aint[0], aint[1]);
            sumFromAllMin += min;
            sumFromAllMax += max;
            minFromAll = MaxMinComparator.min(minFromAll, min);
            maxFromAll = MaxMinComparator.max(maxFromAll, max);

            System.out.println("num1 = " + aint[0] + ",\tnum2 = " + aint[1] + ",\tmin = " + min + ",\tmax = " +  max);
        }
        System.out.println("");
        System.out.println("global min   = " + minFromAll +    ",\tglobal max   = " + maxFromAll);
        System.out.println("");
        System.out.println("Sum from min = " + sumFromAllMin);
        System.out.println("Sum from max = " + sumFromAllMax);

    }
}