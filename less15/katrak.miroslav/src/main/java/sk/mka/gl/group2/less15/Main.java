package sk.mka.gl.group2.less15;

public class Main {

    public static void main(String[] args) {

        String duri = "DURI";
        final String smallDuri = duri.toLowerCase();
        System.out.println("smallDuri: " + smallDuri);


        String eva = "eva";
        String ela = "EVA";
        final boolean equals = eva.equals(ela);
        System.out.println("equals: " + equals);

        final boolean equalsIgnoreCase = eva.equalsIgnoreCase(ela);
        System.out.println("equalsIgnoreCase: " + equalsIgnoreCase);



        final int diff = eva.compareTo(ela);
        System.out.println("diff: " + diff);


//        String[] pole = {"Miro", "Dana", "Jana"};
//        //1.fori
//        for (int i = 0; i < pole.length; i++) {
//            System.out.println("pole[" + i + "]: " + pole[i]);
//        }
//        //2.foreach
//        for (String s : pole) {
//            System.out.println("s: " + s);
//        }
//
//
//
////        1. priklad
//        String s = "ahoj";
//        StringBuffer stringBuffer = new StringBuffer("dobry den");
//        stringBuffer.append(" miro");
//        stringBuffer.append(" miro");
//        stringBuffer.append(" miro");
//        stringBuffer.append(" miro");
//
//
//        String s7 = new String(stringBuffer);
//        System.out.println("s7: " + s7);
//
////        2.priklad
//        String s2 = "ahoj";
//        s2 += "dobry den";
//        s2 += " miro";
//        s2 += " miro";
//        s2 += " miro";
//        s2 += " miro";
//        s2 += " miro";
//        System.out.println("s2: " + s2);


    }
}
