package se.dsve.bank;

import java.util.ArrayList;

public class Bank {
    // Create an ArrayList of BankAccount objects called accounts
    private ArrayList<BankAccount> accounts;

    public Bank() {
        // Initialize the accounts ArrayList
        accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public ArrayList<BankAccount> getAccounts() {
        return accounts;
    }

    public String searchAccount(String identifier) {
        // linear Search to find account
        // defining ArrayList to save all accounts
        ArrayList<BankAccount> find = new ArrayList<>();
        // check every account in this bank
        for(BankAccount account : accounts){
            // get customer of account
            Customer holder = account.getAccountHolder();
            if(identifier.equals(holder.getSocialSecurityNumber())) {
                find.add(account);
            }else if(identifier.equals(holder.getName())) {
                find.add(account);
            }
        }
        // if there is no account that matches
        if(find.size() == 0) {
            return identifier + " doesn't have an account in this bank";
        }else {
            for (BankAccount acc : find) {
                acc.showAccountDetails();
            }
            return "Above are the Bank Account information for " + identifier + "\n";
        }
    }

    public void showAllAccounts() {
        for (BankAccount account : accounts) {
            account.showAccountDetails();
            System.out.println();
        }
    }

    public ArrayList<BankAccount> sortAccountsByBalance() {
        // Create a copy of the original accounts list to avoid modifying the original list
        ArrayList<BankAccount> copy = new ArrayList<>();
        copy.addAll(accounts);
            // use Bubble Sort to sort the list
        for(int i = 0; i < copy.size()-1; i++){
            for(int j = i; j < copy.size()-i-1; j++){
                BankAccount account1 = copy.get(j);
                BankAccount account2 = copy.get(j + 1);
                if(account1.getBalance() < account2.getBalance()){
                    copy.set(j, account2);
                    copy.set(j + 1, account1);
                }
            }
        }
        // return the sorted list
        return copy;
    }
}



