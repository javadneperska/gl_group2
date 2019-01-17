import geometric.Rectangle;

public class Main {
    public static void main(String[] args) {
        // rectangle stuff
        Rectangle r = new Rectangle();
        r.setWidth(1);
        r.setHeight(1);

        Rectangle square = new Rectangle(r);
        System.out.println("Height: " + square.getHeight());
        System.out.println("Width: " + square.getWidth());

        // person stuff here
        Person m = new Person("Miroslav", "Stastny");

        Person yM = new Person();
        yM.setFirstName("Miroslav");
        yM.setLastName("Stastny");

        PersonUtil.printPerson(m);
        PersonUtil.printPerson(yM);
    }
}
