package bookstore.inventory;

import bookstore.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Inventory <T extends Product> {
    protected List<T> products = new ArrayList<>();

    public Inventory() {}

    public Inventory(InventoryRecord inventoryRecord) {
        this.products = inventoryRecord.products;
    }

    public List<T> getAllProduct() {
        return this.products;
    }

    public List<T> getAllProductByType(Class<T> product) {
        List<T> productFiltered = new ArrayList<>();

        for(T t : this.products) {
            if (product.isInstance(t)) productFiltered.add(t);
        }

        return productFiltered;
    }

    public T getProduct(T product) {
        int indexProduct = this.products.indexOf(product);

        if (indexProduct == -1) return null;

        return this.products.get(indexProduct);
    }

    public void addProduct(T product) {
        int indexProduct = this.products.indexOf(product);

        if (indexProduct == -1) this.products.add(product);
    }

    public void remoteProduct(T product) {
        this.products.remove(product);
    }
}
