public class Main {
    public static void main(String[] args) {
        // Less 18 - Vytvorit program, ktory vyrobi obdlznik a kvader, pricom obdlznik bude mat rozmery 3,4 a kvader
        // bude mat rozmery 3,4 5, pricom pouzijeme dedicnost a vypiseme na obrazovku objem kvadra a obsah obdlznika.

        Kvader kvader1 = new Kvader();
        kvader1.setA(3);
        kvader1.setB(4);
        kvader1.setC(5);
        System.out.println("Objem kvadra je : " + kvader1.volume());

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setA(3);
        rectangle1.setB(4);
        System.out.println("Obsah obdlznika je : " + rectangle1.content());

    }
}
