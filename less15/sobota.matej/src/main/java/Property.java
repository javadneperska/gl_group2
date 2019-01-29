
public class Property {
    private String name;
    private boolean man;

    public String getName() {
        return name;
    }

    public boolean isMan() {
        return man;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    @Override
    public String toString() {
        return "Property{" +
                "name='" + name + '\'' +
                ", man=" + man +
                '}';
    }
}
