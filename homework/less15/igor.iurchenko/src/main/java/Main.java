import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop/";

    public static void main(String[] args) {
        FileUtility fileUtility = new FileUtility(",");
        ArrayList<String[]> fileContent = fileUtility.readFile(DESKTOP_PATH + "input.csv");
        List<Person> people = new ArrayList<Person>();
        for (String[] person : fileContent) {
            people.add(new Person(person[0], Arrays.copyOfRange(person, 1, person.length)));
        }

        System.out.println(people.get(0).getOneStringSkills());
        System.out.println(people.get(0).getSkillsWithoutLetter("j"));
        System.out.println(people.get(0).isMatch("java"));
        System.out.println(people.get(0).getSkillWhichStartsWith("sel"));
        System.out.println(people.get(0).getSkillWhichEndsWith("va"));


    }
}