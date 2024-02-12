package org.example.school;

import java.time.Year;
import java.util.Set;

public class Class {

    private String nameOfClass;

    private Integer year;

    private Set<Student> students;

    public Class(String nameOfClass, Integer year, Set<Student> students) {
        this.nameOfClass = nameOfClass;
        this.year = year;
        this.students = students;
    }

    public String getNameOfClass() {
        return nameOfClass;
    }

    public void setNameOfClass(String nameOfClass) {
        this.nameOfClass = nameOfClass;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" + "nameOfClass='" + nameOfClass + '\'' + ", year=" + year + ", students=" + students + '}';
    }
}
