package model;

import java.util.List;

public class Bank {

    List<Account> accounts;

    public Bank(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    public void withdraw(Account account, double amount) {
        account.setBalance(account.getBalance() - amount);
    }

    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }


}
