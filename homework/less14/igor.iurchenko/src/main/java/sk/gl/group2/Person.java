package sk.gl.group2;

import java.util.List;

public class Person {

    public static int personCount = 0;
    private String name;

    public Person() {
        this(null, null);
    }

    public Person(String name, List<Property> properties) {
        Person.personCount++;
        this.name = name;
        this.properties = properties;
    }

    public Person(Person person){
        this(person.name, person.properties);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    private List<Property> properties;

    @Override
    public String toString() {
        return "sk.gl.group2.Person{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }

    public void addProperty(Property property){
        this.properties.add(property);
    }

}
