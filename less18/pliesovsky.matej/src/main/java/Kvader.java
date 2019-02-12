public class Kvader extends Obdlznik{
    private double depth;

    public Kvader() {
        System.out.println("Kvader");
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }


    public double volume(){
        return this.heigh*this.width*this.depth;
    }

    @Override
    public double content() {
        return ((this.heigh*this.width*this.depth)*2);
    }
}
