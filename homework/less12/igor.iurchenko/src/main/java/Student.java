import utilities.PersonUtility;

import java.text.ParseException;

public class Student {
    private String firstName;
    private String lastName;
    private String street;
    private int homeNumber;
    private String city;
    private String bornNumber;

    public Student(String firstName, String lastName, String street, int homeNumber, String city, String bornNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.homeNumber = homeNumber;
        this.city = city;
        this.bornNumber = bornNumber;
    }

    public void printInfo() throws ParseException {
        String template = "First Name: %s%nLast Name: %s%nStreet: %s%nHome number: %d%nCity: %s%nSex: %s%nAge: %d%n";
        String sex = PersonUtility.isMale(this.bornNumber) ? "Male" : "Female";
        int age = PersonUtility.age(this.bornNumber);
        System.out.printf(template, this.firstName, this.lastName, this.street, this.homeNumber, this.city, sex, age);
        System.out.println("------------------------");
    }




}
