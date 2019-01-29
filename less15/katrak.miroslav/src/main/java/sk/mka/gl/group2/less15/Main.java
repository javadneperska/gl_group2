package sk.mka.gl.group2.less15;

public class Main {

    public static void main(String[] args) {

        String csv = "3,5,7,9";
        final String[] split = csv.split(",");

        String n = "miroslav";
        final int a1 = n.indexOf('a');
        System.out.println("a1: " + a1);

        final int a = n.lastIndexOf('a');
        System.out.println("a: " + a);

        final int i = n.indexOf("l");
        System.out.println("i: " + i);

        final char c = n.charAt(5);
        System.out.println("znak na pozicii 5: " + c);


        final String substring = n.substring(3, 5);
        System.out.println("substring: " + substring);

        if(n.startsWith("miro")){
            System.out.println("zacina s miro");
        }

        if(n.endsWith("lav")){
            System.out.println("konci s lav");
        }

        String firstName = "FirstName";
        String lastName = "Surname";

        String firstNameSpace = firstName.concat(" ");
        String wholeName = firstNameSpace.concat(lastName);
        System.out.println("name: " + wholeName);


        String name = firstName + lastName;

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
