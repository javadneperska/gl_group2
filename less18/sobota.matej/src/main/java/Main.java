public class Main {

    public static void main(String[] args) {
        Obdlznik o = new Obdlznik();
        Kvader k = new Kvader();

        o.setSirka(3);
        o.setVyska(4);

        k.setSirka(3);
        k.setVyska(4);
        k.setHlbka(5);

        System.out.println("Obsah obdlznika 3, 4 je: " + o.obsah());

        System.out.println("Objem kvadra 3, 4, 5 je: " + k.objem());
    }

}
//vyrobit obdlnik a kvader..3, 4.....3, 4, 5..pouzit dedicnost a vypisat objem a obsaj obdlznika