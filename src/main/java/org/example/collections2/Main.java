package org.example.collections2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        Set<Film> setOfFilms = new HashSet<>();

        Film film1 = new Film("Harry Potter 1", "Chris Columbus", 2001);
        Film film2 = new Film("Harry Potter 1", "Chris Columbus", 2001);

        films.add(film1);
        films.add(film2);

        setOfFilms.add(film1);
        setOfFilms.add(film2);

        System.out.println("Size of list: " +films.size());
        System.out.println("Size of set: " +setOfFilms.size());

        System.out.println(film1.equals(film2)); // false, po nadpisaniu equals zwraca true
        System.out.println(films.equals(films)); // true
        System.out.println(setOfFilms.equals(setOfFilms)); // true

        System.out.println(film1.hashCode()); // 821270929 a po nadpisaniu hashcode zwraca 2019595103
        System.out.println(film2.hashCode()); // 1160460865 a po nadpisaniu hashcode zwraca 2019595103
    }
}
