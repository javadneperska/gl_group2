import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String filePath1 = "Zoznamstudakov.csv";
        String[] poleFirstName = new String[10];
        String[] poleSurname = new String[10];
        String[] poleRC = new String[10];
        String[] poleGender = new String[10];
        // vytvorenie premennych



        File file1 = new File(filePath1);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file1));

            String line;
            int index = 0;
            while ((line = br.readLine()) != null) {
        // Scanner inputStream = new Scanner(line).useDelimiter(",");
        // inputStream.
                String[] temp = line.split(",");
                String s = Arrays.toString(temp);
                System.out.println("pole: " + s);

                poleFirstName[index] = temp[0];
                poleSurname[index] = temp[1];
                poleRC[index] = temp[5];

                String month = temp[5].trim().substring(2,3);
                int monthint = Integer.valueOf(month);
                System.out.println(monthint);
                if (monthint > 1) {
                    poleGender[index] = "female";


        // zena = 5,6
        // muz = 0,1
                }
                else {
                    poleGender[index] = "male";

                }


                index++;
                }

            for (int i = 0; i < 10; i++)
            {
                System.out.println("FirstName: " + poleFirstName[i] + " Surname:" + poleSurname[i] + " Gender:" + poleGender[i]);
            }



            }

            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                    e.printStackTrace();
            }


        }

    }
