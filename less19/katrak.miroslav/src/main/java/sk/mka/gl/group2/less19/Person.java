package sk.mka.gl.group2.less19;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Person> favoritePersons = new ArrayList<Person>();

    public void addFavoritePerson(Person p) {
        this.favoritePersons.add(p);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
