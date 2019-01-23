package geometry;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.width, rectangle.height);
    }

// metoda na vypocet obsahu rectangla
    public double contents(){
        return this.width * this.height;
    }

    public double circumference(){return this.width*2 + this.height*2;}

    public void printCircumference(){
        System.out.println("Rectangle (a=" + this.getHeight() + ",b=" + this.getWidth() + ") obsah: " + this.circumference());
    }

    public void printContent(){
        System.out.println("Rectangle (a=" + this.getHeight() + ",b=" + this.getWidth() + ") obsah: " + this.contents());
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
