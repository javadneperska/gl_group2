import java.io.IOException;
import java.util.List;

//import Person;

public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
//
        //Person student = new Person();
        CSVReader newCSV = new CSVReader();

        List<Person> people = CSVReader.readPeople();
        for (Person person : people) {
            if (person.isStudent()) {
                System.out.println(person);
            }

        }
    }


}


/*Z csv zoznam studentov : meno, priezvisko, ulica, cislo domu, mesto, rodne cislo, pohlavie
6 zien a 4 muzi
Program vypise na obrazovku vsetkych studentov pricom urci na zaklade rodneho cisla ci je zena alebo muz a vyrata vek
*/