import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        Vytvorte program, ktory bude obsahovat zoznam vlastnosti cloveka, pricom kazda vlastnost bude mat svoje meno
        a priradenie k pohlaviu.
        */

        Person person = new Person();
        person.setName("Patrik");

        List listProperties = new ArrayList<Property>();
        Property p = new Property();
        p.setMan(true);
        p.setName("uprimny");
        listProperties.add(p);

        person.setProperties(listProperties);
        System.out.println(person);
    }
}
