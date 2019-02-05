import java.util.ArrayList;
import java.util.List;

//public class Main {
//
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("miroslav");
//
//        List listProperties = new ArrayList<Property>();
//        Property p = new Property();
//        p.setMan(true);
//        p.setName("nedockavy");
//        listProperties.add(p);
//
//        person.setProperties(listProperties);
//        System.out.println(person);
//
//    }
//}

public class Main {

    public static void main(String[] args) {

        String cav = "3, 5, 7, 9";
        final String[] split = cav.split(",");

        String n = "miroslava";
        final int al = n.indexOf('a');
        System.out.println("al: " + al);

        final int i = n.indexOf('i');
        System.out.println("i: " + i);

        final char c = n.charAt(5);
        System.out.println("znak na pozicii 5: " + c);

//        String n = "miroslav";
//        final String substring = n.substring(3, 5);
//        System.out.println("substring: " + substring);

        String firstName = "FirstName";
        String lastName = "Surname";

        String firstNameSpace = firstName.concat(" ");
        String wholeName = firstNameSpace.concat(lastName);
        System.out.println("name: " + wholeName);

        String name = firstName + lastName;

        String duri = "DURI";
        final String smallDuri = duri.toLowerCase();
        System.out.println("smallDuri: " + smallDuri);

        String eva = "eva";
        String ela = "ela";
//        String ela = "eua";
//        String ela = "eta";
        final boolean equals = eva.equals(ela);
        System.out.println(("equals: " + equals));

        final int diff = eva.compareTo(ela);
        System.out.println("diff: " + diff);

        String[] pole = {"Miro", "Dana", "Jana"};
        for (String s : pole) {
            System.out.println("s: " + s);
        }

        String s = "ahoj";
        StringBuffer stringBuffer = new StringBuffer("dobry den");
        stringBuffer.append("Jano");
        String s7 = new String(stringBuffer);
        System.out.println("s7: " + s7);
    }
}
