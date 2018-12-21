public class Main {
    public static void main(String[] args) {
        boolean x = true;
        int y = 0;
        int z = 1;

        if (x == true) {
            System.out.println("x: " + x);
            y = -1;
        } else {
            System.out.println("x: " + x);
            z = -1;
        }

        int w = (x == true) ? 2 : 1;

        if (x == true) {
            w = 2;
        } else {
            w = 1;
        }

        braker();
        continuer();
    }

    private static int braker() {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                break;
            }
            System.out.println("i - " + i);
        }
        return -1;
    }

    private static int continuer() {
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i - " + i);
        }
        return -1;
    }
}
