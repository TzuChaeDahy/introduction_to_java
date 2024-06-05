package main.java.org.example.oop.three.model.entities;

import main.java.org.example.oop.three.model.exceptions.AccountException;

public class Account {
    private final Integer number;
    private final String holder;
    private final Double withdrawLimit;
    private Double balance;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws AccountException {
        if (balance < 0){
            throw new AccountException("Account error: The balance cannot be negative");
        }

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount) throws AccountException{
        if (amount <= 0) {
            throw new AccountException("Deposit error: The amount to deposit cannot be negative.");
        }

        this.balance += amount;
    }

    public void withdraw(Double amount) throws AccountException {
        if (amount > this.balance) {
            throw new AccountException("Withdraw error: The amount exceeds the balance.");
        }

        if (amount > this.withdrawLimit) {
            throw new AccountException("Withdraw error: The amount exceeds withdraw limit.");
        }

        this.balance -= amount;
    }
}
