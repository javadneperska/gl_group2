package sk.mka.gl.group2.less4;

public class Main {

    public static void main(String[] args) {
        breaker();
        continuer();
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
