public class Main {
    public static void main(String[] args) {

        int[] poleInt1 = {7, 5, 3, 14, 10};
        int[] poleInt2 = {2, 6, 4, 7, 4};
        int sum = 0;

        for (int i = 0; i < poleInt1.length; i++) {
            for (int j = 0; j < poleInt2.length; j++) {
                sum = poleInt1[i] + poleInt2[i];
            }
            System.out.println("Sum of: " + (i+1) + "th iteration is: " + sum);
        }
    }
}
