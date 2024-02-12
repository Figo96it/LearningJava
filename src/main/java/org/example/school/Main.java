package org.example.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Student> mathStudents = Set.of(new Student("Adam","Kowalski"), new Student("Joanna", "Kowalska"));
        Set<Student> itStudents = Set.of(new Student("Robert","Kowalski"), new Student("Ewelina", "Kowalska"));
        Class mathClass = new Class("MathClass", 1, mathStudents);
        Class itClass = new Class("ITClass", 2, itStudents);
        List<Class> classes = List.of(mathClass,itClass);
        School school = new School("Uniwersytet Łódzki", "Łódź", classes);

        Set<Student> polishStudents = Set.of(new Student("Piotr","Żyła"), new Student("Robert", "Karaś"));
        Set<Student> englishStudents = Set.of(new Student("Adam","Małysz"), new Student("Mariusz", "Pudzianowski"));
        Class polishClass = new Class("PolishClass", 3, polishStudents);
        Class englishClass = new Class("EnglishClass", 3, englishStudents);
        List<Class> languagesClasses = List.of(polishClass,englishClass);
        School languageSchool = new School("Szkoła językowa", "Łódź", languagesClasses);

        List<School> schools = List.of(school, languageSchool);

        System.out.println(schools);
    }
}
