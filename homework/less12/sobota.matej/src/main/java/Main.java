import com.opencsv.CSVReader;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static org.apache.commons.lang3.BooleanUtils.or;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        String SAMPLE_CSV_FILE_PATH = "./veci.csv";

        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVReader csvReader = new CSVReader(reader);

        List<String[]> records = csvReader.readAll();

        for (String[] record : records) {
            if (student(record[5]) == 1) {
                System.out.println(record[0] + " " + record[1] + " " + record[2] + " " + record[3] + " " + record[4] + " " + record[5] + " " + sex(record[5]));
            }

        }
    }

//mame nacitat z externeho csv kde mas zoznam ludi 6 zien, 4 muzi, - maju meno, priezvisko, ulica, cislo domu, mesto, rodne cislo
//a na zaklade rodneho cisla vypisat len studentov a vediet identofikovat pohlavia
//a vek

    private static int student (String cislo){
        String rok = Character.toString(cislo.charAt(0));
        rok += Character.toString(cislo.charAt(1));
        int year = Integer.parseInt(rok);

        if (year <= 99 && year >= 95){
            return 1;
        }
        else{
            return 0;
        }

    }


    private static String sex (String rodne){
        if((Character.getNumericValue(rodne.charAt(2)) == 5) || (Character.getNumericValue(rodne.charAt(2)) == 6)){
            return "Female";
        }
        else{
            return "Male";
        }
    }



    private static String year(String rodci){
        String pohl;

        if (sex(rodci) == "Female") {
            int poh = Character.getNumericValue(rodci.charAt(2));
            poh = poh - 5;
            pohl = Integer.toString(poh);
        }
        else{
            pohl = Character.toString(rodci.charAt(2));
        }

        String vysledok = "";
        String a = "";

        for (int i = 0; i < 6; i++) {
            if(i == 2){
                vysledok += pohl;
            }
            else {
                vysledok += Character.toString(rodci.charAt(i));
            }

        }

        return vysledok;
    }




}


