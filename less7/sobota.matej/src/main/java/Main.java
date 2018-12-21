public class Main {
    public static void main(String[] args) {
        boolean x = true;
        int y = 0;
        int z = 1;

        if (x == true){
            System.out.println("x: "+ x);
            y = -1;
        }else{
            System.out.println("y: " + y);
            z = -1;
        }
        //1.
        int w = (x == true) ? 2 : 1;

        //2.
        if (x == true){
            w = 2;
        }else{
            w = 1;
        }
        System.out.println("now methods");
        breaker();
        continuer();

    }

    public static int breaker(){
        for (int i = 0; i < 5; i++) {
            if (i == 1){
                break;
            }
            System.out.println("i: "+ i);
        }
        return 1;
    }

    public static int continuer(){
        for (int i = 0; i < 5; i++) {
            if (i == 1){
                continue;
            }
            System.out.println("i: "+ i);
        }
        return 1;

    }


}
