package sk.gl.group2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static String DESKTOP_PATH = System.getProperty("user.home") + "/Desktop/";

    public static void main(String[] args) {
        FileUtility fileUtility = new FileUtility(",");
        ArrayList<String[]> fileContent = fileUtility.readFile(DESKTOP_PATH + "input.csv");
        List<Person> people = new ArrayList<Person>();
        for (String[] person : fileContent) {
            List<Property> properties = new ArrayList<Property>();
            for (String propertyStr: Arrays.asList(person).subList(1, person.length)) {
                properties.add(new Property(propertyStr.split("=")[0],
                        Boolean.valueOf(propertyStr.split("=")[1])));
            }
            int random = (int)(Math.random() * 50 + 1);
            if (random % 2 == 0){
                people.add(new Person(person[0], properties));
            } else {
                Person d = new Person();
                d.setName(person[0]);
                d.setProperties(properties);
                people.add(d);
            }
        }
        System.out.println(Person.personCount + " were read from file");
        PersonUtils.printPersons(people);
        Scanner line = new Scanner(System.in);
        int input;
        System.out.println("Whom you would like to modify? Enter the number and enter or 0 and enter to exit");
        while((input = line.nextInt()) != 0){
            System.out.println("Provide property name");
            String propertyName = line.next();
            System.out.println("Provide property value");
            boolean propertyValue = Boolean.valueOf(line.next());
            people.get(input-1).addProperty(new Property(propertyName, propertyValue));
            System.out.println("Whom you would like to modify? Enter the number and enter or 0 and enter to exit");
        }
        fileUtility.writeToFile(DESKTOP_PATH + "output.txt", people.toString());
    }
}