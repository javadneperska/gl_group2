public class Main {
    public static void main(String[] args) {
        String riadok = "som na,hodine;javy>teraz";
        String[] retazce = riadok.split("[,;>]");
        for (int i = 0; i < retazce.length; i++) {
            System.out.println(retazce[i]);
        }

        Human clovek = new Human();
        clovek.setMeno("Matej");
        clovek.setPriezvisko("Sobota");
        clovek.setBirth(4, 6, 7);

        System.out.println(clovek.toString());



    }
}
