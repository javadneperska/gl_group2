package sk.mka.gl.group2.less12;

public class Main {

    public static void main(String[] args) {

        Person miro = new Person();
        miro.setFirstName("Miroslav");
        miro.setLastName("Katrak");

        Person youngMiro = new Person();
        youngMiro.setFirstName("Miroslav");
        youngMiro.setLastName("Katrak");

        PersonUtil.printPerson(miro);
        PersonUtil.printPerson(youngMiro);



    }
}
