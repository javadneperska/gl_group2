public class Main {

    public static void main(String[] args) {
//        int y = 0;
//        boolean x = true;
//        int z = 1;
//        if (x == true) {
//            System.out.println("x: " + x);
//            y = -1;
//        } else {
//            System.out.println("x: " + x);
//        }
//
//        // 1. ternarny
//        int w = (x == true) ? 2 : 1;
//
//        // 2.
//        if (x == true) {
//            w = 2;
//        } else {
//            w = 1;
//        }
//
//        // 3.
//        w = 1;
//        if (x == true) {
//            w = 2;
//        }
        breaker();
        continuer();

    }

    public static int continuer() {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println("i: " + i);
        }
        return 1;
    }

    public static int breaker() {
        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                break;
            }
            System.out.println("i: " + i);
        }
        return 1;
    }
}
