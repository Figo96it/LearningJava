package org.example.generictypes;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pair<String, Double> pair = new Pair<>("First value", 40.28);
        String first = pair.first();
        Double second = pair.second();

        System.out.println(first);
        System.out.println(second);
    }
}