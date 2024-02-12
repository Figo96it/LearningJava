package org.example.school;

import java.util.List;

public class School {

    private String nameOfSchool;

    private String address;

    private List<Class> classes;

    public School(String nameOfSchool, String address, List<Class> classes) {
        this.nameOfSchool = nameOfSchool;
        this.address = address;
        this.classes = classes;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Class> getClasses() {
        return classes;
    }

    public void setClasses(List<Class> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "School{" + "nameOfSchool='" + nameOfSchool + '\'' + ", address='" + address + '\'' + ", classes=" + classes + '}';
    }
}
