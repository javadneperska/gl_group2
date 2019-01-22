package geometry;

public class Rectangle {
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

//        public static void printRectangle(Rectangle a) {
//            System.out.println("");
//
//        }

    public double contents() {
        return this.width * this.height;
    }

    public double circumference(){
        return 2 * (this.width + this.height);
    }
}