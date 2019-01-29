package sk.gl.group2;

import java.util.List;

public class PersonUtils {
    public static void printPersons(List<Person> people){
        for (int i = 0; i < people.size(); i++) {
            System.out.println(i+1 + ": " + people.get(i));
        }
    }
}
