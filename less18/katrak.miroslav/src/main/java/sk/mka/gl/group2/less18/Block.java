package sk.mka.gl.group2.less18;

public class Block extends Rectangle {
    private double depth;

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double volume() {
        return this.getHeight() * this.getWidth() * this.depth;
    }

    @Override
    public double content() {
        return ((this.getHeight() * this.getWidth() * this.getDepth())*2);
    }
}
