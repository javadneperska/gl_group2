public class Main {
    public static void main(String[] args) {
        String riadok = "som na,hodine;javy>teraz";
        String[] retazce = riadok.split("[,;>]");
        for (int i = 0; i < retazce.length; i++) {
            System.out.println(retazce[i]);
        }
    }
}
