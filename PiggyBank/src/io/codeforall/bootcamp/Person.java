package io.codeforall.bootcamp;

public class Person {
    public String name;
    public Bank myBank;
    public int amount;

    public Person(String name, Bank myBank) {
        this.name = name;
        this.myBank = myBank;
    }

    public void makeDeposit (int amount) {
        myBank.depositAmount(amount);
    }
    public void makeWithdrawal (int amount) {
        myBank.withdrawAmount(amount);
    }

}
