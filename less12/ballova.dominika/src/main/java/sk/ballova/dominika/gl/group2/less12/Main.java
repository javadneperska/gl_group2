package sk.ballova.dominika.gl.group2.less12;

import sk.ballova.dominika.gl.group2.less12.Geometry.Rectangle;

public class Main {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.setWidth(1);
        r.setHeight(1);

        Rectangle square = new Rectangle(r);
        System.out.println("height: " + square.getHeight());
        System.out.println("width: " + square.getWidth());




       //father
        Person m = new Person();    // alt shift r  - skratka na person : miro sme prepisali na m
        m.setFirstName("Miroslav");
        m.setLastName("Katrak");

        //son
        Person ym = new Person();
        ym.setFirstName("Miroslav");
        ym.setLastName("Katrak");


        PersonUtil.printPerson(m);
        PersonUtil.printPerson(ym);


    }

}
