package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;
    public Account(int balance) {
       this.balance =balance;
    }

    public int getBalance(int i) {
        if (i> balance){
         balance = i -balance;
            return balance;
        }else{
        balance = balance + i;
        return balance;
        }
    }
}
