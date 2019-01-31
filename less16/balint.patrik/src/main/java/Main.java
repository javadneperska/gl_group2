
public class Main {

    public static void main(String[] args) {
        String line = "So>m; na ;hod:ine Ja>v;y.";
        String[] podretazec = line.split("[;>:]");

        for (int i =0; i < podretazec.length; i++){
            System.out.println(podretazec[i]);
        }
        // System.out.println("Print human to_String: " + human.toString());

        System.out.println("*****************************************************");

        Date date1 = new Date(1, "Feb", 1991);
        Date date2 = new Date(2, "Aug", 1992);
        Date date3 = new Date(12, "Jun", 1990);

        Human human1 = new Human("Patrik", "Cajka", date1);
        Human human2 = new Human("Milan", "Vlasaty", date2);
        Human human3 = new Human("Jozef", "Duro", date3);

        System.out.println("First human is: " + human1);
        System.out.println("Second human is: " + human2);
        System.out.println("Third human is: " + human3);
    }
}
