package sk.mka.gl.group2.less12.geomethry;

public class Rectangle {

    public static int countRectangle = 0;

    private double width;
    private double height;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double height) {
        Rectangle.countRectangle++;
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle){
        this(rectangle.width, rectangle.height);
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

    public double contents(){ return this.width*this.height;}

    public double circumference(){return this.width*2 + this.height*2;}

    public void printCircumference(){
        System.out.println("Rectangle (a=" + this.getHeight() + ",b=" + this.getWidth() + ") obvod: " + this.circumference());
    }

    public void printContent(){
        System.out.println("Rectangle (a=" + this.getHeight() + ",b=" + this.getWidth() + ") obsah: " + this.contents());
    }

}


