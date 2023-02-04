package bookstore.product;

import java.util.List;

public class Movie extends Product {
    private List<String> director;
    private String studio;
    private List<String> genre;
    private List<String> producer;

    public Movie(String name, Double price, List<String> director, String studio, List<String> genre, List<String> producer) {
        super(name, price);
        this.director = director;
        this.studio = studio;
        this.genre = genre;
        this.producer = producer;
    }

    public List<String> getDirector() {
        return director;
    }

    public void setDirector(List<String> director) {
        this.director = director;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getProducer() {
        return producer;
    }

    public void setProducer(List<String> producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name=" + this.getName() +
                ", price=" + this.getPrice() +
                ", director=" + this.director +
                ", studio=" + this.studio +
                ", genre=" + this.genre +
                ", producer=" + this.producer +
                ", label=" + this.getLabel() +
                '}';
    }
}
