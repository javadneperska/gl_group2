package sk.mka.gl.group2.less12;

import sk.mka.gl.group2.less12.geomethry.Rectangle;

public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setWidth(1);
        r.setHeight(1);

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
        PersonUtil.printPerson(ym);



    }
}
