import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Property> properties = new ArrayList<Property>();

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, List<Property> properties) {
        this.name = name;
        this.properties = properties;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", properties=" + properties +
                '}';
    }
}
