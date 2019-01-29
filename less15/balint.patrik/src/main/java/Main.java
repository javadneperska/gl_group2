import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String firstName = "Patrik";
        String lastName = "Cajka";

        String firstNameSpace = firstName.concat(" ");
        String wholeName = firstNameSpace.concat(lastName);
        System.out.println("Name is " + wholeName);

        System.out.println("********************************");

        String eva = "eva";
        String ela = "eta";

        final boolean equals = eva.equals(ela);
        System.out.println("Equals " + equals);

        final int diff = eva.compareTo(ela);
        System.out.println("Compare " + diff);

        //  --> Lesson 15 stuff from here:
        String s = "hello";
        StringBuffer stringBuffer = new StringBuffer("Dobry den ");
        stringBuffer.append("Patrik");
        String s7 = new String(stringBuffer);
        System.out.println("s7: " + s7);

        String[] pole= {"Danka", "Evka", "Martinka"};
        // fori
        for (int i = 0; i < pole.length; i++) {
            System.out.println("pole{" + i + "}" + pole[i]);
        }


        /* LESSON 14 stuff here

        Vytvorte program, ktory bude obsahovat zoznam vlastnosti cloveka, pricom kazda vlastnost bude mat svoje meno
        a priradenie k pohlaviu.

        Person person = new Person();
        person.setName("Patrik");

        List listProperties = new ArrayList<Property>();
        Property p = new Property();
        p.setMan(true);
        p.setName("uprimny");
        listProperties.add(p);

        person.setProperties(listProperties);
        System.out.println(person);

        List<Property> xxx = new ArrayList<Property>();
        xxx.add(new Property("nedockavy", true));

        Person person1 = new Person("John", xxx);
        System.out.println(person1);
        */
    }
}
