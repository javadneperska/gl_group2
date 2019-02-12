package sk.mka.gl.group2.less18.geometry;

public class Rectangle {
    protected double width;
    protected double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double content() {
        return this.width * this.height;
    }
}
