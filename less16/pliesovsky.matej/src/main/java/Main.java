public class Main {
    public static void main(String[] args) {
        String s= "Som,na;hodine:javy";
        String[] podretazce = s.split("[;:,<>]");
        for (int i = 0; i < podretazce.length; i++) {
            System.out.println(podretazce[i]);
        }


        Human clovek = new Human();
        clovek.setFirstName("Matej");
        clovek.setLastName("Pliesovsky");

        System.out.println(clovek.toString());

        Human jano = new Human("Jan", "Kovac", new Date(30, 6, 1989));
        Human palo = new Human("Palo", "Halas", new Date(10, 8, 1995));
        Human mato = new Human("Mato", "Haluska", new Date(30, 10, 2004));

        System.out.println(jano);
        System.out.println(palo);
        System.out.println(mato);
    }
}
