import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String filePath1 = "students.csv";
        String[] poleNames = new String[10];
        String[] poleSurname = new String[10];
        String[] poleRC = new String[10];
        String[] polePohlavie = new String[10];
        // vytvorenie premennych



        File file1 = new File(filePath1);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file1));

                String line;
                int index = 0;
                while ((line = br.readLine()) != null) {
     //               Scanner inputStream = new Scanner(line).useDelimiter(",");
     //               inputStream.
                    String[] temp = line.split(",");
                    String s = Arrays.toString(temp);
                    System.out.println("pole: " + s);

                    poleNames[index] = temp[0];
                    poleSurname[index] = temp[1];
                    poleRC[index] = temp[5];

                    String mesiac = temp[5].trim().substring(2,3);
                    int mesiacint = Integer.valueOf(mesiac);
                    System.out.println(mesiacint);
                    if (mesiacint > 1) {
                        polePohlavie[index] = "zena";


                    // zena = 5,6
                    // muz = 0,1
                    }
                    else {
                        polePohlavie[index] = "muz";

                    }


                    index++;
                }

                for (int i = 0; i < 10; i++)
                {
                    System.out.println("Meno: " + poleNames[i] + " Priezvisko:" + poleSurname[i] + " Pohlavie:" + polePohlavie[i]);
                }



        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
