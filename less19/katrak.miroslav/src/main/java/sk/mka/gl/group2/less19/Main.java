package sk.mka.gl.group2.less19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static List<Person> allPerson = new ArrayList<Person>();


    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {

            Person person = new Person();
            person.setId((long) i);
            if (i % 2 == 0) {
                person.setFirstName(i + "Dominika");
                person.setLastName(i + ".Ballova");
            } else {

                Person dominika = allPerson.get(i - 1);
                person.addFavoritePerson(dominika);

                person.setFirstName(i + "Igor");
                person.setLastName(i + ".Jurcenko");
            }
            allPerson.add(person);

        }

        //add oposite relation
        Person igor0 = allPerson.get(1);
        System.out.println(igor0);

        Person dominika0 = allPerson.get(0);
        igor0.addFavoritePerson(igor0);


        for (int i = 0; i < allPerson.size(); i++) {
            System.out.println(allPerson.get(i));
        }
    }
}
