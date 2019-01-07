import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("text.csv");
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
        }
        scanner.close();
    }

//    program ktory z externaho suboru nacita cisla (min 10 )v formate csv nasledne ich vypise scita ich vynasobi a zisti najvecsie a najmensie
}
