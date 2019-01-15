import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {3, 8, 11, 4, 6, 1};
        int[] b = {1, 2, 3, 5, 7, 11};



        // Sortovanie
        Utils.printArray("Pred sortovanim A pola:", a);
        Arrays.sort(a);
        Utils.printArray("Po sortovani A pola:", a);
        System.out.println("******************************");

        Utils.printArray("Pred sortovanim B pola:", b);
        Arrays.sort(b);
        Utils.printArray("Po sortovani B pola:", b);

        System.out.println("******************************");

        // Print arrays
        Utils.printArray("Pred a:", a);
        int sumA = sumArray(a);
        Utils.printArray("Po a:", a);
        System.out.println("sumA: " + sumA);
        System.out.println("******************************");

        Utils.printArray("Pred b:", b);
        int sumB = sumArray(b);
        Utils.printArray("Po b:", b);
        System.out.println("******************************");

        System.out.println("sum_together: " + (sumA + sumB));
    }

    private static int sumArray(int[] b) {
        int sumB = 0;
        for (int hodnota : b) {
            sumB += hodnota;
        }
        return sumB;
    }
}

/*
    List<String> arrayList = new ArrayList();
        arrayList.add("a");
                arrayList.add("b");
                arrayList.add("c");*/

        /*for (String x: arrayList) {
            arrayList.remove(x);
        }*/

// Iterator.remove()
       /* Iterator itr = arrayList.iterator();
        while (itr.hasNext()) {
            String nextValue = (String)itr.next();
            System.out.println("nextValue: " + nextValue);
            itr.remove();
        }


        System.out.println("Modified ArrayList : "
                + arrayList);*/

