public class Main {
    public static void main(String[] args) {
        String d = "Sedim, na; paradnej> hodine: Javy";

        String[] splittedString = d.split("[,;>:]");

        for (String c :
                splittedString) {
            System.out.println(c);
        }

        Human jan = new Human("Jan", "Halacek", new Date(30, 6, 1989));
        Human olala = new Human("Ola", "Bambola", new Date(11, 9, 1995));
        Human pucker = new Human("Tucker", "Ducker", new Date(31, 12, 2004));

        System.out.println(jan);
        System.out.println(olala);
        System.out.println(pucker);

        Human[] humans = new Human[3];
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human("whatever" + i, "whoever" + i, new Date(5,5,1955));
        }

        for (Human ccc :
                humans) {
            System.out.println(ccc);
        }
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        String line = "Sedim; na; parad>nej; hod:ine Ja>v;y";
//        String[] podretazec = line.split("[;>:]");
//
//        for (int i =0; i < podretazec.length; i++){
//            System.out.println(podretazec[i]);
//        }
//
//        Human human = new Human("Jan", "Halacek");
//        System.out.println("Print_human :" + human);
//        System.out.println("Print_human to_String :" + human.toString());
//    }
//}