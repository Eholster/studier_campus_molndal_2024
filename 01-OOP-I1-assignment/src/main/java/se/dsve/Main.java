package se.dsve;

import se.dsve.bank.Bank;
import se.dsve.bank.BankAccount;

import se.dsve.bank.Customer;

import java.util.ArrayList;

public class Main {
    // This code is for demonstration purposes and expects the Bank, BankAccount, and Customer classes to be implemented correctly.
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Create some customers
        Customer customer1 = new Customer("John Doe", "123456-7890");
        Customer customer2 = new Customer("Jane Smith", "987654-3210");

        // Create bank accounts for these customers
        BankAccount account1 = new BankAccount(1, customer1);
        BankAccount account2 = new BankAccount(2, customer2);
        BankAccount account3 = new BankAccount(3, customer1);
        BankAccount account4 = new BankAccount(4, customer1);
        BankAccount account5 = new BankAccount(5, customer2);

        // Add accounts to the bank
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        // Demonstration
        account1.deposit(1000);
        account1.withdraw(500);

        account2.deposit(2000);

        account3.deposit(1000);
        account3.withdraw(500);

        account4.deposit(3000);
        account4.withdraw(500);

        account5.deposit(2500);
        account5.withdraw(500);

        // Show all accounts
        System.out.println("All accounts:");
        // check that there is an existing account
        if(bank.getAccounts().size() == 0){
            System.out.println("Bank doesn't have any Account so far");
        }else {
            bank.showAllAccounts();
        }
        // Search for an account by name
        System.out.println("Searching for account by name:" + "\n");
        String result = bank.searchAccount("John Doe");
        System.out.println(result);

        // Sort accounts by balance
        System.out.println("Sorting accounts by balance:" + "\n");
        ArrayList<BankAccount> sortedAccounts = bank.sortAccountsByBalance();
        if(sortedAccounts.size() == 0) {
            System.out.println("Bank doesn't have any Account so far");
        }else {
            for (BankAccount account : sortedAccounts) {
                account.showAccountDetails();
                System.out.println("---------------");
            }
        }
    }
}

