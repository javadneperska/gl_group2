public class Obdlznik {
    protected double width;
    protected double heigh;

    public Obdlznik() {
        System.out.println("Obdlznik");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public void setHeigh(double heigh) {
        this.heigh = heigh;
    }

    public double content(){
        return this.width*this.heigh;
    }

}
