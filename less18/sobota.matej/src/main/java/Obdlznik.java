public class Obdlznik {
    protected double sirka;
    protected double vyska;

    public double obsah(){
        return this.vyska*this.sirka;
    }

    public double getSirka() {
        return sirka;
    }

    public void setSirka(double sirka) {
        this.sirka = sirka;
    }

    public double getVyska() {
        return vyska;
    }

    public Obdlznik() {
        System.out.println("obdlznik");
    }

    public void setVyska(double vyska) {
        this.vyska = vyska;
    }
}
