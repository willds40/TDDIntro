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
        balance = account.depositMoney(50);
        assertThat(balance, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        balance = account.withdrawMoney(50);
        assertThat(balance, is(50));
    }
    @Test

    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        balance = account.withdrawMoney(50);
        assertThat(balance, is(50));
    }
}
