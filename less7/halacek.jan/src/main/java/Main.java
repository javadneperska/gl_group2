public class Main {

    public static void main(String[] args) {

        breaker();
        continuer();

        boolean x = true;
        int y = 0;
        int z = 1;

        if (x == true) {
            System.out.println("x: " + x);
            y = 1;
        } else {
            System.out.println("x: " + x);
            z = 1;
        }

        int w = (x == true) ? 2 : 1;

        if (x == true) {
            w = 2;
        } else {
            w = 1;
        }
    }

    private static int continuer() {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println("i: " + i);
        }
        return 1;
    }

    private static int breaker() {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                break;
            }
            System.out.println("i: " + i);
        }
        return 1;
    }


}
