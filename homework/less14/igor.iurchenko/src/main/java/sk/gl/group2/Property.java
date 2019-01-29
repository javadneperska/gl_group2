package sk.gl.group2;

public class Property {
    public Property(String properyName, boolean properyValue) {
        this.properyName = properyName;
        this.properyValue = properyValue;
    }

    public String getProperyName() {
        return properyName;
    }

    public void setProperyName(String properyName) {
        this.properyName = properyName;
    }

    public boolean isProperyValue() {
        return properyValue;
    }

    public void setProperyValue(boolean properyValue) {
        this.properyValue = properyValue;
    }

    private String properyName;
    private boolean properyValue;

    @Override
    public String toString() {
        return "sk.gl.group2.Property{" +
                "properyName='" + properyName + '\'' +
                ", properyValue=" + properyValue +
                '}';
    }
}
