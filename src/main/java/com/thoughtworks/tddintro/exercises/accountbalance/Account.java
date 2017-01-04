package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;
    public Account(int balance) {
        this.balance =balance;
    }

    public int getBalance() {
        return balance;
    }

    public int depositMoney (int amount){
            balance = balance + amount;
            return balance;
        }


    public int withdrawMoney (int amount) {
        balance = balance - amount;
        if (balance < 0){
            balance = balance * (balance * 2);
        }
        return balance;
    }
}
