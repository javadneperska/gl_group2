import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("CSVHuman.csv");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int pocetriadkov = 0;
            Human[] poleHuman = new Human[5];

            while ((line = br.readLine()) != null) {
                String[] pole = line.split(",");
                Human human = new Human(pole[0], pole[1]);
                poleHuman[pocetriadkov] = human;
                pocetriadkov++;
                                           }
            for (int i = 0; i < poleHuman.length; i++) {
                System.out.println(poleHuman[i]);
            }

            System.out.println("Pocet riadkov je: " + pocetriadkov);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}






// projekt , ktory naimportuje zoznam Humnas, z externeho suboru .. ale tak, aby program zistil kolko riadkov je v subore pricom kazdy riadok reprezentuje jednu osobu, nasledne
//vyrobi pole humans , dane hodnoty ulozi do pola zo suboru a vypise na obrazovku z pola ...
// pole, import .. spojit ...



