package bookstore.product;

import bookstore.product.Product;

public class Toys extends Product {
    private String type;

    public Toys(String name, Double price, String type) {
        super(name, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "name=" + this.getName() +
                ", price=" + this.getPrice() +
                ", type=" + type +
                ", label=" + this.getLabel() +
                '}';
    }
}
