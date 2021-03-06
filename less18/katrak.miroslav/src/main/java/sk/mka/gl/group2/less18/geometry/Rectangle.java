package sk.mka.gl.group2.less18.geometry;

public  class Rectangle {
    protected double width;
    protected double height;

    public Rectangle() {
    }

    public Rectangle(double height) {
        this.height = height;
        System.out.println("Rectangle");
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

    public final void setHeight(double height) {
        this.height = height;
    }

    public  double content() {
        return this.width * this.height;
    }
}
