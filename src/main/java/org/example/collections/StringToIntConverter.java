package org.example.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides a mechanism to convert a list of Strings to a list of Integers.
 */
public class StringToIntConverter {

    public static void main(String[] args) {
        // Example list of Strings
        List<String> listOfStrings = List.of("2", "16", "21", "18", "1");

        // Perform conversion
        List<Integer> listOfIntegers = convertStringListToInteger(listOfStrings);

        // Display the result
        System.out.println("Converted Integer List: " + listOfIntegers);
    }

    /**
     * Converts a list of Strings to a list of Integers.
     *
     * @param listOfStrings The list of Strings to be converted.
     * @return A list of Integers converted from the input Strings.
     */
    private static List<Integer> convertStringListToInteger(List<String> listOfStrings) {
        List<Integer> listOfIntegers = new ArrayList<>();

        for (String string : listOfStrings) {
            // Convert String to Integer
            listOfIntegers.add(Integer.parseInt(string));
        }

        return listOfIntegers;
    }
}
