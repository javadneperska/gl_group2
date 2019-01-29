import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Matej");

        List listPropertys = new ArrayList<Property>();
        Property p = new Property();
        p.setMan(false);
        p.setName("Nedockavy");
        listPropertys.add(p);

        p.setMan(true);
        p.setName("Uprimny");
        listPropertys.add(p);

        person.setPropertys(listPropertys);
        System.out.println(person);



    }

}