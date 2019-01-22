
import geometry.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[3];
        rect[0] = new Rectangle();
        rect[0].setHeight(1);
        rect[0].setWidth(1);

        rect[1] = new Rectangle(8, 9);
        rect[2] = new Rectangle(10, 12);
        double contentSum = 0;
        double aroundSum = 0;

        for (Rectangle r : rect) {
            System.out.printf("Rectangle(a=%f, b=%f) obsah: %f%n", r.getWidth(), r.getHeight(), r.contents());
            System.out.printf("Rectangle(a=%f, b=%f) circumference: %f%n", r.getWidth(), r.getHeight(), r.circumference());
            contentSum += r.contents();
            aroundSum += r.circumference();
        }
        System.out.println("Content sum: " + contentSum);
        System.out.println("Content sum: " + aroundSum);

// System.out.println("Height " + rect.getHeight());
// System.out.println("Width " + rect.getWidth());
//
// Rectangle square = new Rectangle(rect);
//
// System.out.println("Height " + square.getHeight());
// System.out.println("Width " + square.getWidth());
//
// Person miro = new Person();
// miro.setFirstName("Miroslav");
// miro.setLastName("Katrak");
//
// Person igor = new Person("Igor", "Iurchenko");
//
// PersonUtil.printPerson(miro);
// PersonUtil.printPerson(igor);
    }
}

//program z ext suboru nacita zoznam studentov o studentoch sa budu sirit budu mat evidovane meno, priezv, ulica, cislo domu, mesto, rodne cislo, pohlavie
// 6 zien a 4 muzi, program vipise na obrazovku vsetkich studentov pricom urci na zaklade rodneho cisla zi je to zena alebo muz a vypocita vek.