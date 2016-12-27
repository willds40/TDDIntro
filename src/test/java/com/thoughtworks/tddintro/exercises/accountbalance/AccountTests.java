package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AccountTests {
    private Account account;
    private  int balance;

    @Before
    public void setup(){
    this.account = new Account(100);
    }
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        balance = account.getBalance(50);
        assertThat(balance, is(150));
    }
    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        balance = account.getBalance(-50);
        assertThat(balance, is(50));
    }
    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
    Account account = new Account(50);
        balance = account.getBalance(100);
        assertThat(balance, is(50));
    }
}
