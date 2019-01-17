public class Main {
    public static void main(String[] args) {

        Person m = new Person();
        m.setFirstName("Miroslav");
        m.setLastName("Stastny");

        Person yM = new Person();
        yM.setFirstName("Miroslav");
        yM.setLastName("Stastny");

        PersonUtil.printPerson(m);
        PersonUtil.printPerson(yM);
    }
}
