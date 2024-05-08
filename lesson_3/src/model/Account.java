package model;

public class Account{
    private final String name;
    private double balance;

    public Account(String name) {
        this.name = name;
        this.balance = 0;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}