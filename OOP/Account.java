package OOP;

public class Account {
    private String name;
    private double balance;

    public Account(String accountHolder) {
        this.name = accountHolder;
        this.balance = 100.00;
    }

    public void withdraw() {
        this.balance = this.balance - 20.00;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    public Double balance() {
        return this.balance;
    }
}
