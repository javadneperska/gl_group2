public class Main {
    public static void main(String[] args) {
        formatLine("Ahoj");
        formatLine("som");
        formatLine("na");
        formatLine("hodine");
        formatLine("java.");
    }

    private static void formatLine(String s) {
        System.out.format("|%15s %n", s);
    }
}
