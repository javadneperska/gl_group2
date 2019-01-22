import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {3, 8, 11, 4, 6, 11};
        int[] b = {1, 2, 3, 5, 7, 11};

        Arrays.sort(a);
        Utils.printArray("po sortovani a", a);


    //    Utils.printArray("pred a", a);

        int sumA = sumArray(a);
        Utils.printArray("po a", a);


        System.out.println("sumA: " + sumA);
        Utils.printArray("pred b", b);
        int sumB = sumArray(b);
        Utils.printArray("po b", b);

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




