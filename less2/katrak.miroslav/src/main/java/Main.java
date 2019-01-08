
public class Main {

    public static void main(String[] args) {

        int x = 3;
        int y = ++x;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println("*********************");
        x = 3;
        y = 0;
        y = x++;
        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
