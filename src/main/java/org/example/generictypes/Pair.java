package org.example.generictypes;

/**
 * A class representing a pair of objects with generic data types.
 *
 * @param <F> Type of the first element of the pair.
 * @param <S> Type of the second element of the pair.
 */
public class Pair<F, S> {

    private F first;    // The first element of the pair.
    private S second;   // The second element of the pair.

    /**
     * Constructor creating a pair with the given first and second elements.
     *
     * @param first  The first element of the pair.
     * @param second The second element of the pair.
     */
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    /**
     * Method returning the first element of the pair.
     *
     * @return The first element of the pair.
     */
    public F first() {
        return first;
    }

    /**
     * Method returning the second element of the pair.
     *
     * @return The second element of the pair.
     */
    public S second() {
        return second;
    }
}
