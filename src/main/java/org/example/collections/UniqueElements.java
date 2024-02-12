package org.example.collections;

import java.util.*;

/**
 * The UniqueElements class demonstrates the extraction of unique elements from a list.
 * It includes examples with Integer and Double values.
 */
public class UniqueElements {

    public static void main(String[] args) {
        // Example with Integer values
        List<Integer> values = new ArrayList<>();
        values.add(10);
        values.add(11);
        values.add(10);
        values.add(11);
        values.add(12);
        values.add(11);

        List<?> uniqueValues = uniqueElements(values);
        System.out.println("Integer unique values: " + uniqueValues);

        // Example with Double values
        List<Double> doubleValues = new ArrayList<>();
        doubleValues.add(10.78);
        doubleValues.add(110.990);
        doubleValues.add(110.990);
        doubleValues.add(21.89);
        doubleValues.add(765.990);

        List<?> uniqueDoubleValues = uniqueElements(doubleValues);
        System.out.println("Double unique values: " + uniqueDoubleValues);

    }

    /**
     * Returns a list containing unique elements from the input list.
     *
     * @param values The input list with potential duplicates.
     * @return A list containing only unique elements from the input list.
     */
    private static List<?> uniqueElements(List<?> values) {
        Set<?> uniqueElements = new HashSet<>(values);
        return new ArrayList<>(uniqueElements);
    }
}
