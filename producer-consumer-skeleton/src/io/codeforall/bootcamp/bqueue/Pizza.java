package io.codeforall.bootcamp.bqueue;

public class Pizza {

    private Topping topping;

    public Pizza(){
        topping = Topping.values()[(int)(Math.random() * Topping.values().length)];
    }

    @Override
    public String toString() {
        return "A " + topping.name() + " pizza";
    }

    private enum Topping {
        PEPPERONI,
        PINEAPPLE,
        MUSHROOM,
        PEPPERS,
        EXTRA_CHEESE;
    }

    public Topping getTopping() {
        return topping;
    }
}
