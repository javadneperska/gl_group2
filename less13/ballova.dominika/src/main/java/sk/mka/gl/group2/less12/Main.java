package sk.mka.gl.group2.less12;

import sk.mka.gl.group2.less12.geomethry.Rectangle;

public class Main {

    public static void main(String[] args) {

        //3 times rectangle
//        1.
        Rectangle a = new Rectangle();
        a.setWidth(3);
        a.setHeight(4);
        a.printRectangle();

//        2.
        Rectangle b = new Rectangle(8, 9);
        b.printRectangle();

        //3.
        Rectangle c = new Rectangle(10, 12);
        c.printRectangle();

        System.out.println("number of rectangle is: " + Rectangle.countRectangle);

       /* Rectangle r = new Rectangle();
        System.out.println("r_height: " + r.getHeight());
        System.out.println("r_width: " + r.getWidth());
        Rectangle square = new Rectangle(r);
        System.out.println("height: " + square.getHeight());
        System.out.println("width: " + square.getWidth());
        //father
        Person m = new Person();
        m.setFirstName("Miroslav");
        m.setLastName("Katrak");
        //son
        Person ym = new Person("Miroslav", "Katrak");
        PersonUtil.printPerson(m);
        PersonUtil.printPerson(ym);*/
    }

}