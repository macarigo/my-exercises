package io.codeforall.bootcamp;

public class Main {

    public static void main(String[] args) {

        Bank myBank = new Bank ("BPI");
        Person person1 = new Person ("Mario", myBank);

        System.out.println("Hi " + person1.name + " welcome to " + myBank.name + ", how can I help you today?");

        person1.makeDeposit(1000);
        person1.makeWithdrawal(750);

    }
}
