package org.example.collections2;

import java.time.Year;
import java.util.Objects;

public class Film {

    private String title;

    private String director;

    private int publicationDate;

    public Film(String title, String director, int publicationDate) {
        this.title = title;
        this.director = director;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public boolean equals(Object o){
        return (Objects.equals(this.title, ((Film) o).title) && Objects.equals(this.director, ((Film) o).director) && this.publicationDate == ((Film)o).publicationDate);
    }

    @Override
    public int hashCode(){
        return this.title.hashCode() + this.director.hashCode() + this.publicationDate;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
