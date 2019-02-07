import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] pole = new Integer[5];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = new Integer(i + 1);
            pole[i] = i;

        }
        System.out.println(Arrays.toString(pole));

        Integer x = 5;


        changeValueInteger(x);
        System.out.println("x po volani metody je " + x);

        Person matejko = new Person();

        matejko.setLastName("Sobota");
        matejko.setFirstName("Matej");

        modifyPerson(matejko);
        System.out.println(matejko.getLastName());

        System.out.println("pole pred: " + Arrays.toString(pole));
        changeField(pole);
        System.out.println("pole po: " + Arrays.toString(pole));


    }

    private static void changeField(Integer[] pole) {
        for (int i = 0; i < 5; i++) {
            pole[i]++;
        }
    }

    private static void modifyPerson(Person matej) {
        matej.setLastName("Katrak");
    }

    private static void changeValueInteger(Integer x) {
        x = 6;
        System.out.println("x je "+ x);
    }


}
