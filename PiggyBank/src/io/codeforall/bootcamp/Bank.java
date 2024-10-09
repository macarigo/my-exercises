package io.codeforall.bootcamp;

import java.util.Random;

public class Bank {
    public static String name;
    public int amount;
    public int accountBalance;

    public Bank(String name) {
        this.name = name;
    }

    public void depositAmount (int amount) {
        System.out.println("Your current balance is: " + accountBalance + "€.");
        if (amount <= 0) {
            System.out.println("Please provide an amount higher than 1€");
        }
        else {
            this.accountBalance = accountBalance + amount;
            System.out.println(amount + "€ has been deposited in your account. Your new balance is: " + accountBalance + "€.");
        }
    }

    public void withdrawAmount (int amount) {
        System.out.println("Your current balance is: " + accountBalance + "€.");
        if (accountBalance <= amount || amount < 0) {
            System.out.println("Sorry, not enough balance to withdraw " + amount + ".");
        }
        else {
            accountBalance = accountBalance - amount;
            System.out.println(amount + "€ has been withdrawn from your account. Your new balance is: " + accountBalance + "€.");
        }
    }
}


