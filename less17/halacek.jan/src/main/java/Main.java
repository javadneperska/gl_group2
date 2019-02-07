import java.util.Arrays;

//public class Main {
//    public static void main(String[] args) {
//
//        Integer[] pole = new Integer[10];
//
//        for(int i = 0; i < pole.length; i++){
//            pole[i] = i+1;
//        }
//
//        System.out.println(Arrays.toString(pole));
//    }
//}

public class Main {
    public static void main(String[] args) {

        Integer[] secondField = {0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(secondField));

        incrementField(secondField);

        System.out.println(Arrays.toString(secondField));

        int x = 5;
        changeValue(x);
        System.out.println("x po volani metody: " + x);


        Person jan = new Person();
        jan.setFirstName("j");
        jan.setLastName("h");

        modifyPerson(jan);
        System.out.println("po volani metody: " + jan.getLastName());
    }

    public static void modifyPerson(Person jan) {
        jan.setLastName("Halacek");
    }

    public static void changeValue(int x) {
        x = 6;
        System.out.println("x je: " + x);
    }

    private static void incrementField(Integer[] secondField) {
        for (int i = 0; i < secondField.length; i++) {
            secondField[i] = secondField[i] + 1;
        }
    }
}
//pole 1, 2, 3, 4
//metodu, ktora ku kazdemu prvku pola pripocita 1