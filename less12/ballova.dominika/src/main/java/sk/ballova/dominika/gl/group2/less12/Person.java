package sk.ballova.dominika.gl.group2.less12;

public class Person {





    private String firstName;
    private String lastName;

    // alt insert constructor .. alt n
    public Person() {
        System.out.println("Person creation with default constructor");
    }

// ked vytvorim novy konstruktor tak defaultnytam uz nie je ... !!! zapamatat si DOZIVOTNE !!
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
