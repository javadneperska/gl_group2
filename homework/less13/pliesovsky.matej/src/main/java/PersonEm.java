import java.util.ArrayList;
import java.util.Arrays;

public class PersonEm {

    private String firstName;
    private String lastName;
    private String workEntryDate;
    private int stage;
    private ArrayList<String> workSkills = new ArrayList<String>();

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

    public String getWorkEntryDate() {
        return workEntryDate;
    }

    public void setWorkEntryDate(String workEntryDate) {
        this.workEntryDate = workEntryDate;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public ArrayList<String> getWorkSkills() {
        return workSkills;
    }

    public void setWorkSkills(ArrayList<String> workSkills) {
        this.workSkills = workSkills;
    }

    public PersonEm(String[] fileLine) {
        this.firstName = fileLine[0];
        this.lastName = fileLine[1];
        this.workEntryDate = fileLine[2];
        this.stage = Integer.parseInt(fileLine[3]);
        this.workSkills.addAll(Arrays.asList(fileLine).subList(4, fileLine.length));
    }

    public void printEmployee(){
        System.out.println(toString());
    }

    public String toString(){
        return this.firstName + " " + this.lastName + " " + this.workEntryDate + " " + this.stage + " " +
                this.workSkills.toString();
    }

}
