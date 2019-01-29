import listOfProps.Person;
import listOfProps.Property;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Matej");
        List listProperty= new ArrayList<Property>();
        Property p = new Property();
        p.setMan(true);
        p.setName("uprimny");
        listProperty.add(p);

        person.setProperties(listProperty);
        System.out.println(person);
    }

}


///program ktory bude obsahovat zoznam vlastnosti cloveka, pricom kazda vlastnost bude mat svoje meno priradene k pohlaviu