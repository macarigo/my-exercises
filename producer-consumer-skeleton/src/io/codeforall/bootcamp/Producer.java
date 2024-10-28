package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.BQueue;
import io.codeforall.bootcamp.bqueue.Pizza;

/**
 * Produces and stores integers into a blocking queue
 */
public class Producer implements Runnable {

    private final BQueue<Pizza> queue;
    private int elementNum;
    private int pizzasMade;

    /**
     * @param queue      the blocking queue to add elements to
     * @param elementNum the number of elements to produce
     */
    public Producer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    @Override
    public void run() {
        pizzasMade = 0;
        while (pizzasMade < elementNum) {
            Pizza pizza = new Pizza();

            this.queue.offer(pizza);
            pizzasMade++;
            // System.out.println("I've made a new pizza " + pizza.getTopping() + " there are now " + queue.getSize() + " pizzas in the queue.");
        }
    }

}
