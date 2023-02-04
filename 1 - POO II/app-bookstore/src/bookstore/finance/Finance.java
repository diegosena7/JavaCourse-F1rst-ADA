package bookstore.finance;

public class Finance {
    private Double balance = 0.00;

    public Double getBalance() {
        return this.balance;
    }

    public void addBalance(Double balance) {
        this.balance += balance;
    }
}
