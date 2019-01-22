package sk.mka.gl.group2.less12;

import sk.mka.gl.group2.less12.geomethry.Rectangle;

public class Main {

    public static void main(String[] args) {


        Rectangle a = new Rectangle();
        a.setHeight(3);
        a.setWidth(3);

        Rectangle b = new Rectangle(8,9);

        Rectangle c = new Rectangle(10, 12);


        System.out.println("Obsah je: " + a.contents());
        System.out.println("Obsah je: " + b.contents());
        System.out.println("Obsah je: " + c.contents());



//
//        //father
//        Person m = new Person();
//        m.setFirstName("Miroslav");
//        m.setLastName("Katrak");
//
//        //son
//        Person ym = new Person("Miroslav", "Katrak");
//
//        PersonUtil.printPerson(m);
//        PersonUtil.printPerson(ym);



    }




}
