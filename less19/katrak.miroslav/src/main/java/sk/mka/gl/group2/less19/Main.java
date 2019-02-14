package sk.mka.gl.group2.less19;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 30; i++) {
            Person person = new Person();

            person.setId((long) i);
            if (i % 2 == 0) {
                person.setFirstName(i + "Dominika");
                person.setLastName(i + ".Ballova");
            }else{
                person.setFirstName(i + "Igor");
                person.setLastName(i + ".Jurcenko");
            }
        }
    }
}
