package bookstore.product;

import java.util.UUID;

public class Product implements Comparable<Product> {
    private String id = UUID.randomUUID().toString();
    private String name;
    private Double price;
    private ProductLabel label;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public ProductLabel getLabel() {
        return label;
    }

    public void setLabel(ProductLabel label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product product) {
        return this.compareTo(product);
    }
}
