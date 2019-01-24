import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {


        String csvFile = "input.csv";
        BufferedReader br = null;
        String line;
        String cvsSplitBy = ",";

        String[] poleName = new String[10];
        String[] poleSurname = new String[10];
        String[] poleDate = new String[10];
        String[] polePrax = new String[10];
        String[] poleTech = new String[10];

        public CSVReader () // konstruktor ..nema void ..musi byt taky nazov ako je nazov claas
        {

        }

        public void getBestEmployees ()  //metoda
        {
            csvFile = "test";
            try {

                br = new BufferedReader(new FileReader(csvFile));
                int index = 0;

                while ((line = br.readLine()) != null) {

                    String[] pole1 = line.split(cvsSplitBy);
                    poleName[index] = pole1[0];
                    poleSurname[index] = pole1[1];
                    pole[index] = temp[5];


                    index++;


//                System.out.println("Employee " + country[4] + " , name=" + country[5] + "]");
                }


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }



    }

