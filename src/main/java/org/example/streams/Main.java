package org.example.streams;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Harry Potter", "Disney", 170, LocalDate.of(2001, 1, 1));
        Movie movie2 = new Movie("Harry Potter 2", "Horror", 170, LocalDate.of(2018, 1, 1));

        // Applying filters using Stream API
        List<Movie> movies = Stream.of(movie1, movie2)
                .filter(m -> m.getDuration() > 20 && m.getType().equalsIgnoreCase("Horror")
                        && m.getReleaseDate().getYear() >= 2018).toList();
        System.out.println(movies);
    }
}
