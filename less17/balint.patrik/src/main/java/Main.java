import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Integer[] pole = {0,1,2,3,4};;
        System.out.println("Array pred inkrementaciou : " + Arrays.toString(pole));
        increaseFieldByOne(pole);
        System.out.println("Array po inkrementacii : " + Arrays.toString(pole));

        System.out.println("************************************");

        int x = 5;
        changeValue(x);
        System.out.println("X po volani metody: " + x);

        // int xInte = 5;
        Integer xInte = new Integer(5);
        changeValueInteger(xInte);
        System.out.println("xInte po volani metody xInte: " + xInte);

        System.out.println("************************************");

        Person m = new Person();
        m.setFirstName("M");
        m.setLastName("K");

        modifyPerson(m);
        System.out.println("Po volani metody: " + m.getLastName());
    }

    private static void modifyPerson(Person miro) {
        miro.setLastName("Katrak");
    }

    private static void changeValue(int x) {
        x = 6;
        System.out.println("x je : " + x);
    }

    private static void changeValueInteger(Integer x) {
        x = 6;
        System.out.println("xInte je : " + x);
    }

    private static void increaseFieldByOne(Integer[] pole) {
        for (int i = 0; i < pole.length; i++) {
            pole[i] = pole[i] + 1;
        }
    }
}