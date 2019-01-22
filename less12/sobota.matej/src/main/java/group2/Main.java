package group2;

import Geometry.Rectangle;
import group2.PersonUtil;

public class Main {

    public static void main(String[] args) {

        Person matej = new Person("Matej","Sobota");


        Person youngMatej = new Person();
        youngMatej.setFirstName("matej");
        youngMatej.setLastName("sobota");

        PersonUtil.printPerson(matej);
        PersonUtil.printPerson(youngMatej);

        Rectangle r = new Rectangle();

        Rectangle square = new Rectangle(r);



    }

}
