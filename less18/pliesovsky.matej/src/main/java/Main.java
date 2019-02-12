public class Main {
    public static void main(String[] args) {
        Obdlznik o = new Obdlznik();
        o.setWidth(3);
        o.setHeigh(4);
        System.out.println(o.content());


        Kvader k = new Kvader();
        k.setDepth(5);
        k.setHeigh(4);
        k.setWidth(3);

        System.out.println(k.volume());
        System.out.println(k.content());
    }
}
//program ktory vyroby obdlznik(3,4) a kvader(3,4,5), dve klasy, vypisat objem, vypisat obsah