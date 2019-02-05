import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        Homework less 16 : Vytvorit program, ktory naimportuje externy CSV file so zoznamom humanov. Z tohto file-u
        zisti, kolko riadkov je v subore, pricom kazdy riadok reprezentuje jedneho humana.
        Nasledne vytvori pole humanov. Hodnoty ulozi do pola a vypise humanov z tohto pola na obrazovku.
        */

        CSVreader csvReader = new CSVreader(",");
        ArrayList<String[]> humansCSV = csvReader.readFile(System.getProperty("user.dir") + "/src/main/resources/Humans.csv");

        System.out.println("Number of humans in CSV file is :" + humansCSV.size());

        System.out.println("*****************************************************");

        ArrayList<Human> humans = new ArrayList<Human>();

        for (String[] person : humansCSV) {
            humans.add(new Human(person[0]));
        }

        // Print all the humans from CSV file
        for (int i = 0; i < humans.size(); i++) {
            System.out.print(humans.get(i));
        }

        System.out.println("*****************************************************");
    }
}
