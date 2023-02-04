package bookstore.product;

import java.util.List;

public class AlbumMusic extends Product {
    private List<String> artist;
    private List<String> genre;
    private List<String> stamp;

    public AlbumMusic(String name, Double price, List<String> artist, List<String> genre, List<String> stamp) {
        super(name, price);
        this.artist = artist;
        this.genre = genre;
        this.stamp = stamp;
    }

    public List<String> getArtist() {
        return artist;
    }

    public void setArtist(List<String> artist) {
        this.artist = artist;
    }

    public List<String> getGenre() {
        return genre;
    }

    public void setGenre(List<String> genre) {
        this.genre = genre;
    }

    public List<String> getStamp() {
        return stamp;
    }

    public void setStamp(List<String> stamp) {
        this.stamp = stamp;
    }

    @Override
    public String toString() {
        return "AlbumMusic{" +
                "name=" + this.getName() +
                ", price=" + this.getPrice() +
                ", artist=" + this.artist +
                ", genre=" + this.genre +
                ", stamp=" + this.stamp +
                ", label=" + this.getLabel() +
                '}';
    }
}
