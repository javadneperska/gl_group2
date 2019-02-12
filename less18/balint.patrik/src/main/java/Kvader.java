public class Kvader extends Rectangle{

    private int c;

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
}

    public double volume() {
        return this.content() * this.c;
    }
}
