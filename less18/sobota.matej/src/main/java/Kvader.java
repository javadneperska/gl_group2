public class Kvader extends Obdlznik{
    private double hlbka;

    public double objem(){
        return this.obsah()*this.hlbka;
    }

    public Kvader() {
        System.out.println("kvader");
    }

    public double getHlbka() {
        return hlbka;
    }

    public void setHlbka(double hlbka) {
        this.hlbka = hlbka;
    }
}
