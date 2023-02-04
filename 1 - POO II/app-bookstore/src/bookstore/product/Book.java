package bookstore.product;

import java.util.List;

public class Book extends Product {
    private List<String> genre;
    private String author;
    private String publisher;

    public Book(String name, Double price, List<String> genre, String author, String publisher) {
        super(name, price);
        this.genre = genre;
        this.author = author;
        this.publisher = publisher;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name=" + this.getName() +
                ", price=" + this.getPrice() +
                ", genre=" + this.genre +
                ", author=" + this.author +
                ", publisher=" + this.publisher +
                ", label=" + this.getLabel() +
                '}';
    }
}
