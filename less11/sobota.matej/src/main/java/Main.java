import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = {3, 8, 11, 4, 6, 7};
        int[] b = {11, 1, 2, 3, 5, 7};


        Arrays.sort(a);
        Utils.printArray("after sort a", a);
        int sumA = sumArray(a);
        Utils.printArray("po a", a );
        System.out.println("sumA: " + sumA);



        Arrays.sort(b);
        Utils.printArray("after sort b", b);
        int sumB = sumArray(b);
        Utils.printArray("po b", b );


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

