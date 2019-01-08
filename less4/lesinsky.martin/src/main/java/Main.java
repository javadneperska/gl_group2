
public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        int z = -1;

        if (x == 3 && y == 7 && z == -1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // modulo example - modulo nam deli a zistuje ci je zvysok po deleni
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("i: " + i + " je parne");
            } else {
                /*System.out.println("i: " + i + " je neparne");*/
            }

        }

        // domaca uloha - urobte program ktory z klavestnice vyzve uzivatela aby zadal dve cisla a nasledne tie cisla vypise na obrazovku pricom povie ci ide o parne alebo neparne cislo.

        int i = -1234;
        System.out.format("i = %-7ahoj%n",i);

    }
}

