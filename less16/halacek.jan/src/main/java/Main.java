public class Main {
    public static void main(String[] args) {
        String d = "Soma, na; hodine: Javy";

        String[] splittedString = d.split("[,;:]");

        for (String c :
                splittedString) {
            System.out.println(c);
        }

        Human oleg = new Human("Jan", "Halacek", new Date(30, 6, 1989));
        Human moleg = new Human("Ola", "Bambola", new Date(11, 9, 1995));
        Human zeleg = new Human("Tucker", "Ducker", new Date(31, 12, 2004));

        System.out.println(oleg);
        System.out.println(moleg);
        System.out.println(zeleg);
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