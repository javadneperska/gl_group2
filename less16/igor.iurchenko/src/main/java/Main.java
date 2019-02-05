public class Main {
    public static void main(String[] args) {
        String d = "Soma, na; hodine: Javy";

        String[] splittedString = d.split("[,;:]");

        for (String c :
                splittedString) {
            System.out.println(c);
        }

        Human oleg = new Human("igor", "iurchenko", new Date(30, 6, 1989));
        Human moleg = new Human("igor", "iurchenko", new Date(10, 8, 1995));
        Human zeleg = new Human("igor", "iurchenko", new Date(30, 10, 2004));

        System.out.println(oleg);
        System.out.println(moleg);
        System.out.println(zeleg);
    }
}
