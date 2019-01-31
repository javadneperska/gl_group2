public class Main {
    public static void main(String[] args) {
        String s= "Som,na;hodine:javy";
        String[] podretazce = s.split("[;:,<>]");
        for (int i = 0; i < podretazce.length; i++) {
            System.out.println(podretazce[i]);
        }
    }
}
