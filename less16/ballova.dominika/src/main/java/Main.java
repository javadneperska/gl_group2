public class Main {
    public static void main(String[] args) {
        String s = "Som,na;hodine:javy";
        String[] podretazce = s.split("[;:,<>]");
        for (int i = 0; i < podretazce.length; i++) {
            System.out.println(podretazce[i]);
        }

        Human dominika = new Human();
        dominika.setFirstName("Domi");
        dominika.setLastName("Ballova");
        System.out.println(dominika.toString());

        Date dobIgor = new Date(30, 6, 1989);
        Human oleg = new Human("igor", "iurchenko", dobIgor);


        Date dobSads = new Date(10, 8, 1995);
        Human moleg = new Human("sdsa", "sadsad", dobSads);


        Date dobWeg = new Date(30, 10, 2004);
        Human zeleg = new Human("dasdas", "weqweqw", dobWeg);

        System.out.println(oleg);
        System.out.println(moleg);
        System.out.println(zeleg);


        Human[] pole = new Human[3];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = new Human();
            if (i == 0) {
                pole[i].setFirstName("miro");
                pole[i].setLastName("katrak");
            } else if (i == 1) {
                pole[i].setFirstName("domi");
                pole[i].setLastName("ballova");
            } else if (i == 2) {
                pole[i].setFirstName("jany");
                pole[i].setLastName("halahala");

            }
            System.out.println(pole[i]);
        }
    }
}


// projekt , ktory naimportuje zoznam Humnas, z externeho suboru .. ale tak, aby program zistil kolko riadkov je v subore pricom kazdy riadok reprezentuje jednu osobu, nasledne
//vyrobi pole humans , dane hodnoty ulozi do pola zo suboru a vypise na obrazovku z pola ...
// pole, import .. spojit ...