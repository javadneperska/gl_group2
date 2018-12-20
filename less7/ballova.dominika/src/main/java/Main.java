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
            System.out.println("i: + i");
        }
        return 1;
    }

    private static int breaker(){
        for (int i = 0; i < 3; i++) {
            if (i == 1){
                break;
            }
            System.out.println("i: + i");
        }
        return  1;
    }



/*

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

        // 1. terarny zapis ..ale lepsie je if else normalne
        int w = (x == true) ? 2 : 1;

        // 2.
        if (x == true) {
            w = 2;
        } else {
            w = 1;
        }

        // 3.
        w = 1;
        if (x == true) {
            w = 2;
        }

        // ked mam break opustam metodu
        // break sa spaja s cyklom nejakym for ..
// ak mam 3 mozne nadobudnute stavy tak pisem switch ... break musi byt po kazdom moznom case ...


    }*/
}
