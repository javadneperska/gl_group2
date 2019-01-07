package sk.mka.gl.group2.less5;


public class Main {

    public static void main(String[] args) {

        String yourDecision = getYourDecision(1);
        System.out.println("yourDecision:" + yourDecision);

        if(yourDecision.equalsIgnoreCase("nasobenie")){
            System.out.println("som nasobil");
        }

    }

    private static void formatLine(String s) {
        System.out.format("|%6s|%n", s);
    }


    /**
     * nasobenie 1
     * delenie 2
     * odpocitavanie 3
     *
     * @param mathematicOperation
     * @return
     */
    private static String getYourDecision(int   mathematicOperation) {
        String operacia = "unknown";

        switch (mathematicOperation) {
            case 1:
                operacia = "nasobenie";
                break;
            case 2:
                operacia = "delenie";
                break;
            case 3:
                operacia = "odpocitavanie";
                break;

            default:
                operacia = "unknown";
                break;
        }



        return operacia;
    }


    private boolean isTrueThat() {
        int x = 3;

        int xedo = (x == 3) ? 2 : 1;
        System.out.println("xedo: " + xedo);


        return true;
    }
}
