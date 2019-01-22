import geometry.Rectangle;

public class Main {

    public static void main(String[] args) {

//        3.times rectangle
//        1.
        Rectangle a = new Rectangle();
        a.setWidth(3);
        a.setHeight(4);
        System.out.println("contents:" + a.contents());
//        2.
        Rectangle b = new Rectangle(8,9);
        System.out.println("contents:" + b.contents());

//        3.
        Rectangle c = new Rectangle(10,12);
        System.out.println("contents:" + c.contents());

        a.printContent();
        b.printContent();
        c.printContent();

        System.out.println("Contents together: " + (a.contents()+b.contents()+c.contents()));
        System.out.println("Circumferences togenher: " + (a.circumference()+b.circumference()+c.circumference()));
        /*
        Rectangle r = new Rectangle();
        System.out.println("height: " + r.getHeight());
        System.out.println("width: " + r.getWidth());

        Rectangle square = new Rectangle(r);
        System.out.println("height: " + square.getHeight());
        System.out.println("width: " + square.getWidth());

        Person matej = new Person("Matej","Pliesovsky");

        Person youngMatej = new Person();
        youngMatej.setFirstName("Matej");
        youngMatej.setLastName("Pliesovsky");

        PersonUtil.printPerson(matej);
        PersonUtil.printPerson(youngMatej);
        */
    }
}
