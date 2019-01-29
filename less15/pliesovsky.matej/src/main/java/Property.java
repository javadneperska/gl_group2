public class Property{

    private String name;
    private Boolean man;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMan() {
        return man;
    }

    public void setMan(Boolean man) {
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
