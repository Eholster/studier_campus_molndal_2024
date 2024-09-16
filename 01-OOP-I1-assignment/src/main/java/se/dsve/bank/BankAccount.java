package se.dsve.bank;

public class BankAccount {
    // Create private fields: accountNumber, balance, and accountHolder
    private int accountNumber;
    private double balance;
    private Customer accountHolder;

    public BankAccount(int accountNumber, Customer accountHolder) {
        // Initialize the accountNumber, accountHolder, and balance
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder.getName());
        System.out.println("Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public Customer getAccountHolder() {
        return accountHolder;
    }
}

