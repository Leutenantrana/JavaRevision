package OOP;

public class Main {
    public static void main(String[] args) {
        Account myAccount = new Account("My account", 100.0);

        // Deposit 20.0 into the account
        myAccount.deposit(20.0);

        // Print the balance
        System.out.println("The balance of the account is now: " + myAccount.balance());
    }

}

class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        }
    }

    public double balance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return this.accountName + ": " + this.balance;
    }
}
