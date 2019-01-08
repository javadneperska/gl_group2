package sk.mka.gl.group2.less9;

public class Picture {

    public Picture() {
        Stand.NUMBER_OF_PICTURE++;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
