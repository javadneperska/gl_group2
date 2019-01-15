package sk.mka.gl.group2.less11;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 7, 11};
        int[] b = {1, 2, 3, 5, 7, 11};
        Utils.printArray(a);
        int sumA = sumArray(a);
        Utils.printArray(a);
        System.out.println("sumA: " + sumA);
        Utils.printArray(b);
        int sumB = sumArray(b);
        Utils.printArray(b);

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

