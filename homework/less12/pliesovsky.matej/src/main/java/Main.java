import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import static java.nio.charset.StandardCharsets.*;

public class Main {

    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
//
        File file = new File("src/main/resources/listOfP.csv");
        List<String> lines = Files.readAllLines(file.toPath(), UTF_8);
        for (String line : lines) {
            String[] array = line.split(";");
            System.out.println(array[array.length - 1]);
            System.out.println(" ");
        }
    }
}



/*Z csv zoznam studentov : meno, priezvisko, ulica, cislo domu, mesto, rodne cislo, pohlavie
6 zien a 4 muzi
Program vypise na obrazovku vsetkych studentov pricom urci na zaklade rodneho cisla ci je zena alebo muz a vyrata vek
*/