package org.example.generictypes;

import java.lang.Number;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Create a Pair with a String and a Double
        Pair<String, Double> pair = new Pair<>("First value", 40.28);

        // Retrieve values from the Pair
        String first = pair.first();
        Double second = pair.second();

        // Print the values
        System.out.println(first);
        System.out.println(second);

        // Create an Integer array and perform a swap operation
        Integer[] array1= {1,2,3,4,5,6,7,8};
        swap(array1, 2, 4);

        // Create an Integer array and perform a swap operation
        System.out.println(array1[2]+" "+array1[4]);
    }

    /**
     * Swaps elements at specified positions in a generic array.
     *
     * @param <Numbers>      The generic type for the array elements.
     * @param array         The array of elements to perform the swap on.
     * @param firstIndex    The index of the first element to be swapped.
     * @param secondIndex   The index of the second element to be swapped.
     * @return              The array with elements swapped at the specified positions.
     *                      Returns the original array if indices are invalid or equal.
     */
    public static <Numbers extends Number> Numbers[] swap(Numbers[] array, int firstIndex, int secondIndex) {
        // Check if indices are valid and distinct
        if (firstIndex > array.length - 1 || firstIndex < 0 || secondIndex < 0 || secondIndex > array.length - 1 || firstIndex == secondIndex) {
            return array;
        }
        // Perform the swap
        Numbers tmp = array[secondIndex];
        array[secondIndex] = array[firstIndex];
        array[firstIndex] = tmp;

        return array; // Return the array with elements swapped
    }
}