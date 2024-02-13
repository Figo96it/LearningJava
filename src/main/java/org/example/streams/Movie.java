package org.example.streams;

import java.time.LocalDate;


/**
 * Represents a movie with basic information such as title, type, duration, and release date.
 */
public class Movie {

    private String title;
    private String type;
    private long duration;
    private LocalDate releaseDate;

    /**
     * Constructs a Movie object with the specified parameters.
     *
     * @param title       The title of the movie.
     * @param type        The type or genre of the movie.
     * @param duration    The duration of the movie in minutes.
     * @param releaseDate The release date of the movie.
     */
    public Movie(String title, String type, long duration, LocalDate releaseDate) {
        this.title = title;
        this.type = type;
        this.duration = duration;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", duration=" + duration +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
