package io.codeforall.bootcamp;

import io.codeforall.bootcamp.bqueue.Pizza;
import io.codeforall.bootcamp.bqueue.BQueue;

/**
 * Consumer of integers from a blocking queue
 */
public class Consumer implements Runnable {

    private final BQueue<Pizza> queue;
    private int elementNum;
    private int pizzasEaten;

    /**
     * @param queue      the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */
    public Consumer(BQueue queue, int elementNum) {
        this.queue = queue;
        this.elementNum = elementNum;
    }

    @Override
    public void run() {
        while (pizzasEaten < elementNum) {
            try {
                Thread.sleep((long) (Math.random() * 2500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Pizza pizza = this.queue.poll();
            pizzasEaten++;
        }
    }
}

