import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Person person = new Person();
//        person.setName("Matej");
//        List listProperty = new ArrayList<Property>();
//        Property p = new Property();
//        p.setMan(true);
//        p.setName("nedockavy");
//        listProperty.add(p);
//
//        person.setProperties(listProperty);
//        System.out.println(person);

        String s ="Ahoj";
        StringBuffer buf= new StringBuffer("Dobry den");
        String s7=new String(buf);
        System.out.println("s7:" + s7);

        String[] pole = {"Mato", "Dana", "Jana"};
        for (int i = 0; i < pole.length; i++) {
            System.out.println("pole[ " + i + "]: " + pole[i]);
        }

        String eva = "eva";
        String ela = "ela";
        final boolean equal = eva.equals(ela);
        System.out.println(equal);

        final int diff=eva.compareTo(ela);
        System.out.println("diff: " + diff);

        String duri = "DURI";
        final String smallDuri = duri.toLowerCase();
        System.out.println("smallDuri: " + smallDuri);

        String firstName = "Matej";
        String lastName = "Pliesovsky";
        firstName.concat(" ");
        String wholeName = firstName.concat(lastName);
        System.out.println(wholeName);

        String n = "miroslav";
        final int a1 = n.indexOf('a');
        System.out.println("a1: " + a1);

        final int a = n.lastIndexOf('a');
        System.out.println("a: " + a);

        final int i = n.indexOf("l");
        System.out.println("i: " + i);

        final char c = n.charAt(5);
        System.out.println("znak na pozicii 5: " + c);


        final String substring = n.substring(3, 5);
        System.out.println("substring: " + substring);

        if(n.startsWith("miro")){
            System.out.println("zacina s miro");
        }

        if(n.endsWith("lav")){
            System.out.println("konci s lav");
        }

    }

}

//program ktory vytvori zoznam studentov o pracu vo firme, pricom program obsah. min, 10 studentov, kazdy bude mat zoznam svojich profesii, a program bude vyuzivat co najvioac method s prezentacie cislo 8

