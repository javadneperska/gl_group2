package sk.gl.group2.less13hometask;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {
    private String name;
    private String surname;
    private String employmentDate;
    private int stage;
    private ArrayList<String> technologies = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public ArrayList<String> getTechnologies() {
        return technologies;
    }

    public void setTechnologies(ArrayList<String> technologies) {
        this.technologies = technologies;
    }

    public Employee(String[] fileLine) {
        this.name = fileLine[0];
        this.surname = fileLine[1];
        this.employmentDate = fileLine[2];
        this.stage = Integer.parseInt(fileLine[3]);
        this.technologies.addAll(Arrays.asList(fileLine).subList(4, fileLine.length));
    }

    public void printEmployee(){
        System.out.println(toString());
    }

    public String toString(){
        return this.name + " " + this.surname + " " + this.employmentDate + " " + this.stage + " " +
                this.technologies.toString();
    }

}
