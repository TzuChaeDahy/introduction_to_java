package main.java.org.example.exercises.banking;

public class Account {
    private final int number;
    private String holder;
    private double balance;

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0;
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return this.number;
    }

    public String getHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return String.format("Account: %d, Holder: %s, Balance: $ %.2f\n", this.getNumber(), this.getHolder(), this.getBalance());
    }
}
