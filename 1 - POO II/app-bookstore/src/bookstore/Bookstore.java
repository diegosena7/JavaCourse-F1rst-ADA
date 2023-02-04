package bookstore;

import bookstore.client.Client;
import bookstore.finance.Finance;
import bookstore.inventory.Inventory;
import bookstore.inventory.InventoryRecord;
import bookstore.product.*;

import java.util.List;

public class Bookstore {
    private static Finance finance = new Finance();
    private static InventoryRecord inventoryRecord = new InventoryRecord();
    private static Inventory<AlbumMusic> albumMusic = new Inventory<>(inventoryRecord);
    private static Inventory<Book> book = new Inventory<>(inventoryRecord);
    private static Inventory<Game> game = new Inventory<>(inventoryRecord);
    private static Inventory<Movie> movie = new Inventory<>(inventoryRecord);
    private static Inventory<Toys> toys = new Inventory<>(inventoryRecord);

    public static void initializeStore() {
        // Add AlbumMusic
        AlbumMusic albumMusic1 = new AlbumMusic("Lightning Bolt", 100.00, List.of("Pearl Jam"), List.of("Alternative rock","Grunge"), null);
        AlbumMusic albumMusic2 = new AlbumMusic("Everlong", 200.000, List.of("Foo Fighters"), List.of("Alternative rock", "Hard rock", "Post-grunge", "Classic Rock"), null);
        AlbumMusic albumMusic3 = new AlbumMusic("Yellow Submarine", 300.00, List.of("The Beatles"), List.of("Rock"), null);
        albumMusic.addProduct(albumMusic1);
        albumMusic.addProduct(albumMusic2);
        albumMusic.addProduct(albumMusic3);

        // Add Book
        Book book1 = new Book("Clean Code", 400.00, List.of("Software","Technology"), "Robert Cecil Martin", "Prentice Hall");
        Book book2 = new Book("Clean Architecture", 500.00, List.of("Software","Technology"), "Robert Cecil Martin", "Prentice Hall");
        Book book3 = new Book("Scrum: The Art of Doing Twice the Work in Half the Time", 600.00, List.of("Agile Methodology","Technology"), "Jeff Sutherland", "Crown Business");
        book.addProduct(book1);
        book.addProduct(book2);
        book.addProduct(book3);

        // Add Game
        Game game1 = new Game("FIFA 23", 700.00, "Origin", "Sports", "EA Sports");
        Game game2 = new Game("Street Fighter", 800.00, "Capcom", "Fighting", "Capcom");
        Game game3 = new Game("Donkey Kong Country", 900.00, "Nintendo", "Platform", "Rare");
        game.addProduct(game1);
        game.addProduct(game2);
        game.addProduct(game3);

        // Add Movie
        Movie movie1 = new Movie("Metal Lords", 1000.00, List.of("Peter Sollett"), "Netflix", List.of("Comedy", "Musical"), List.of("Greg Shapiro", "D.B. Weiss"));
        Movie movie2 = new Movie("Yesterday", 1200.00, List.of("Danny Boyle"), "Universal Pictures", List.of("Comedy", "Musical"), List.of("Bernie Bellew", "Tim Bevan", "Danny Boyle", "Richard Curtis", "Eric Fellner", "Matthew James Wilkinson"));
        Movie movie3 = new Movie("Ready Player One", 1200.00, List.of("Steven Spielberg"), "Warner Bros. Pictures", List.of("Science Fiction", "Pop Culture Fiction"), List.of("Donald De Line", "Kristie Macosko Krieger", "Steven Spielberg", "Dan Farah"));
        movie.addProduct(movie1);
        movie.addProduct(movie2);
        movie.addProduct(movie3);

        // Add Toys
        Toys toys1 = new Toys("Lego", 1300.00, "Puzzle");
        Toys toys2 = new Toys("Monopoly", 1400.00, "Board");
        Toys toys3 = new Toys("Dominoes", 1500.00, "Board");
        toys.addProduct(toys1);
        toys.addProduct(toys2);
        toys.addProduct(toys3);

        // List All Items
        System.out.println("\nList All Items: " + inventoryRecord.getAllProduct());

        // List Item by Category
        System.out.println("\nList Item by Category (Size): " + inventoryRecord.getAllProductByType(AlbumMusic.class).size());
        System.out.println("List Item by Category (Items): " + inventoryRecord.getAllProductByType(AlbumMusic.class));

        // Get Specific Product
        System.out.println("\nGet Specific Product (game2): " + inventoryRecord.getProduct(game2));

        // Update Specific Product
        inventoryRecord.getProduct(game1).setLabel(ProductLabel.ADULT);
        System.out.println("\nGet Specific Product (game1): " + inventoryRecord.getProduct(game1));

        // Update Specific Product
        inventoryRecord.getProduct(game2).setPrice(1000.00);
        System.out.println("\nGet Specific Product (game2): " + inventoryRecord.getProduct(game2));

        // Remove Specific Product
        inventoryRecord.remoteProduct(game2);
        System.out.println("\nGet Specific Product (game2): " + inventoryRecord.getProduct(game2));

        // Client
        Client client = new Client("Thiago", "12.345.678-9", 12345678901l, "1993-03-09");
        System.out.println("\nClient: " + client);

        // Purchase Operation
        ShoppingCart shoppingCart = new ShoppingCart(client, finance, inventoryRecord);
        shoppingCart.add(game1);
        shoppingCart.add(book2);
        shoppingCart.purchase();

        System.out.println("\nPurchase Operation Total: " + shoppingCart.getTotal());
        System.out.println("Purchase Operation Discount: " + shoppingCart.getDiscount());
        System.out.println("Purchase Operation Total With Discount: " + shoppingCart.getTotalWithDiscount());

        // Get Balance Finance
        System.out.println("\nGet Balance Finance: " + finance.getBalance());
    }

    public static void main(String[] args) {
        initializeStore();
    }
}
