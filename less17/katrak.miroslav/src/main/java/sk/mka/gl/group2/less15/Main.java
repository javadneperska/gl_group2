package sk.mka.gl.group2.less15;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        changeValue(x);
        System.out.println("x po volani metody: " + x);

//        Integer xInte = new Integer(5);
//        changeValueInteger(xInte);
//        System.out.println("xInte po volani metody xInte: " + xInte);

        Person m = new Person();
        m.setFirstName("m");
        m.setLastName("k");
        m.setAge(30);

        modifyPerson(m);
        System.out.println("po volani metody: " + m.getLastName());
        System.out.println("age po volnai: " + m.getAge());

    }

    private static void modifyPerson(Person person) {
        person.setLastName("Katrak");
        person.setAge(40);
    }

    private static void changeValue(int x) {
        x = 6;
        System.out.println("x je: " + x);
    }
    private static void changeValueInteger(Integer xIne) {
        xIne = 6;
        System.out.println("xIne je: " + xIne);
    }
}
