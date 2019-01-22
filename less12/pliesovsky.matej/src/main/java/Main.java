import com.sun.org.apache.bcel.internal.generic.PUTFIELD;
import geometry.Rectangle;

public class Main {

    public static void main(String[] args) {

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
    }
}
