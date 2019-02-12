package sk.mka.gl.group2.less18.geometry;

public class Block extends Rectangle {
    private double depth;

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double volume() {
        return this.width * this.height * this.depth;
    }

    @Override
    public double content() {
        return (this.width * this.height* this.depth *2);
    }
}
