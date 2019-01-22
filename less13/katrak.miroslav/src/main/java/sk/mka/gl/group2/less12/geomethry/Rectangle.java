package sk.mka.gl.group2.less12.geomethry;

public class Rectangle {

    private double width;
    private double height;


    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.width, rectangle.height);
    }

    public double contents() {
        return this.width * this.height;
    }


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
}
