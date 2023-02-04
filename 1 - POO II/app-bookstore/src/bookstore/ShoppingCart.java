package bookstore;

import bookstore.client.Client;
import bookstore.finance.Finance;
import bookstore.inventory.InventoryRecord;
import bookstore.product.Book;
import bookstore.product.Product;
import bookstore.product.ProductLabel;

import java.util.List;

public class ShoppingCart {
    private Double total = 0.00;
    private Double totalWithDiscount = 0.00;
    private Double discount = 0.00;
    private final Client client;
    private final Finance finance;
    private final InventoryRecord inventoryRecord;
    private final InventoryRecord products = new InventoryRecord();
    private final int ADULT_AGE = 18;
    private final Double PERCENT_DISCOUNT_BOOK = 0.15;
    private final Double MINV_ALUE_TO_DISCOUNT_BOOK = 200.00;
    public ShoppingCart(Client client, Finance finance, InventoryRecord inventoryRecord) {
        this.client = client;
        this.finance = finance;
        this.inventoryRecord = inventoryRecord;
    }

    public Double getTotal() {
        return total;
    }

    public Double getTotalWithDiscount() {
        return totalWithDiscount;
    }

    public Double getDiscount() {
        return discount;
    }

    public void add(Product product) {
        this.validadeAdultContentAndAge(product);
        this.products.addProduct(product);
    }

    public void purchase() {
        List<Product> products = this.products.getAllProduct();
        Double priceTotalBook = 0.00;

        for (Product product : products) {
            this.total += product.getPrice();
            this.inventoryRecord.remoteProduct(product);

            if (product instanceof Book) {
                priceTotalBook += product.getPrice();
            }
        }

        this.totalWithDiscount = total;

        this.calcDiscountByBook(priceTotalBook);

        this.finance.addBalance(this.totalWithDiscount);
    }

    private void validadeAdultContentAndAge(Product product) {
        if (product.getLabel() == ProductLabel.ADULT && client.age() < ADULT_AGE) {
            throw new RuntimeException("Operação não permitida.");
        }
    }

    private void calcDiscountByBook(Double priceTotalBook) {
        if (priceTotalBook > MINV_ALUE_TO_DISCOUNT_BOOK) {
            this.discount = this.total * PERCENT_DISCOUNT_BOOK;
            this.totalWithDiscount = this.total - this.discount;
        }
    }
}
