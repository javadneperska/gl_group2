import java.util.ArrayList;

public class Main {
    private static String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop/";

    public static void main(String[] args) {
        FileUtility fileUtility = new FileUtility(",");
        ArrayList<String[]> fileContent = fileUtility.readFile(DESKTOP_PATH + "input.csv");

        ArrayList<Human> humans = new ArrayList<Human>();

        for (String[] person : fileContent) {
            humans.add(new Human(person[0]));
        }

        System.out.println(humans);

    }



}
