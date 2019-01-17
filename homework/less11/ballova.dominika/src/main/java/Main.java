
//    public static void main(final String[] args) {
//        int[] poleInt = {1, 3, 5, 7};
//        int suma = 0;
//
//        for (int hodnota : poleInt) {
//            suma += hodnota;
//        }
//        System.out.println("suma " + suma);
//    }
//}

//
//    public static void main(String[] args) {
//        int[] poleInt = {1, 7, 5, 3};
//        String s = Arrays.toString(poleInt);
//        System.out.println("pole: " + s);
//    }
//}
//
//    public static void main(String[] args) {
//
//        int[] poleInt = {1, 7, 5, 3};
//        System.out.println("pred: " + Arrays.toString(poleInt));
//        Arrays.sort(poleInt);
//        System.out.println("po: " + Arrays.toString(poleInt));
//
//    }
//}

//
//    public static void main(String[] args) {
//        int[][]a = new int[5][4];
//        System.out.println("pocet_riadkov: " + a.length);
//        System.out.println("pocet_stlpcof: " + a[0].length);
//
//
//    }
//}



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

    public class Main {


        public static void main(String[] args) {
            // -define .csv file in app
            String filePath1 = "pole1.csv";
            String filePath2 = "pole2.csv";

                int[] poleInt1 = new int[5];
                int[] poleInt2 = new int[5];


                // -File class needed to turn stringName to actual file
                File file1 = new File(filePath1);
                File file2 = new File(filePath2);

                try {
                    // -read from filePooped with Scanner class
                    Scanner inputStream = new Scanner(file1).useDelimiter(",");
                    // hashNext() loops line-by-line
                    int index = 0;
                    while (inputStream.hasNext()) {
                        //read single line, put in string
                        String data = inputStream.next();
                        System.out.println(data);
                        poleInt1[index] = Integer.valueOf(data);
                        index++; //index = index + 1
                    }
                    String s = Arrays.toString(poleInt1);
                    System.out.println("pole: " + s);

                    // after loop, close scanner
                    inputStream.close();


                } catch (FileNotFoundException e) {

                    e.printStackTrace();
                }

            try {
                // -read from filePooped with Scanner class
                Scanner inputStream = new Scanner(file2).useDelimiter(",");
                // hashNext() loops line-by-line
                int index = 0;
                while (inputStream.hasNext()) {
                    //read single line, put in string
                    String data = inputStream.next();
                    System.out.println(data);
                    poleInt2[index] = Integer.valueOf(data);
                    index++; //index = index + 1
                }
                String s = Arrays.toString(poleInt2);
                System.out.println("pole: " + s);

                // after loop, close scanner
                inputStream.close();


            } catch (FileNotFoundException e) {

                e.printStackTrace();
            }
            Arrays.sort(poleInt1);
            System.out.println("pole1 po: " + Arrays.toString(poleInt1));

            Arrays.sort(poleInt2);
            System.out.println("pole2 po: " + Arrays.toString(poleInt2));


            int suma1=0;
            for(int hodnota : poleInt1){
                suma1 += hodnota;
            }
            System.out.println("suma1 " + suma1);

            int suma2=0;
            for(int hodnota : poleInt2){
                suma2 += hodnota;
            }
            System.out.println("suma2 " + suma2);
            int celkova_suma = suma1 + suma2;
            System.out.println("celkova suma " + celkova_suma);



            }
        }


