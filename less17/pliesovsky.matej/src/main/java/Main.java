import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // pole desiatich integerov
//        Integer[] field = new Integer[10];
//
//        for (int i = 0; i < field.length; i++) {
//            field[i] = new Integer(i+1);
//            field[i] = i*5;
//        }
//        System.out.println(Arrays.toString(field));
//
//        int x = 5;
//        changeValue(x);
//        System.out.println("x pred zmenou:" + x);
//
//        int xInte = 5;
//        changeValueInte(xInte);
//        System.out.println("x pred zmenou:" + xInte);
//
//        Person m= new Person();
//        m.setFirstName("Matej");
//        m.setLastName("P");
//
//        modifyPerson(m);
//        System.out.println("po zmene last name: " +m.getLastName());
//
//
        Integer[] field = new Integer[5];
        for (int i = 0; i < field.length; i++) {
            field[i] = new Integer(i+1);
            field[i] = i;
        }
        System.out.println(Arrays.toString(field));
        modifyField(field);
        System.out.println("Po zmene: " + Arrays.toString(field));
    }


//    private static void modifyPerson(Person matej){
//        matej.setLastName("Pliesovsky");
//    }
//
//    private static void changeValue(int x){
//        x=6;
//        System.out.println("x="+x);
//    }
//
//    private static void changeValueInte(int xInte){
//        int x = 6;
//        System.out.println("x="+x);
//    }

    private static void modifyField(Integer[] field){
        for (int i = 0; i < 5; i++) {
            field[i]++;
        }
    }
}

//vyrobte pole s prvkami 0,1,2,3,4 a metodou ho modifikujte na 1,2,3,4,5
