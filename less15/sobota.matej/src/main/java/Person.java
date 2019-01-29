import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private List<Property> propertys = new ArrayList<Property>();


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, List<Property> propertys) {
        this.name = name;
        this.propertys = propertys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Property> getPropertys() {
        return propertys;
    }

    public void setPropertys(List<Property> propertys) {
        this.propertys = propertys;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", propertys=" + propertys +
                '}';
    }
}
