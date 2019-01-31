import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String csv = "3,4,6,8";
        String[] split = csv.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }




        String cislo = "0123456789";
        System.out.println(cislo.indexOf("6"));
        System.out.println(cislo.charAt(5));

        System.out.println(cislo.substring(3,5));


        String name = "miro";
        String surname = "dalsi";
        System.out.println(name.concat(surname));



        String duri = "DURI";
        String smallDuri = "";
        smallDuri = duri.toLowerCase();
        System.out.println(duri);
        System.out.println(smallDuri);




        String eva = "eva";
        String ela = "elb";

        System.out.println(eva.equals(ela));
        System.out.println(eva.compareTo(ela));






        String[] pole = {"miro", "matej", "janka"};
        for (int i = 0; i < 3; i++) {
            System.out.println(pole[i]);
        }
        for (String s :pole) {
            System.out.println(s);
        }


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

        String s = "string";
        StringBuffer buf = new StringBuffer("hello");
        buf.append(" prikladam");
        String s7 = new String(buf);
        System.out.println("s7: " + s7 + " " + s);




    }

}

//vytvori zoznam studentov potencialnych o pracu vo firme..pricom program bude obsahovat min 10 studentov..kazdy bude obsahovat zoznam svojich profesii..a co najviac metod z prez 8
//