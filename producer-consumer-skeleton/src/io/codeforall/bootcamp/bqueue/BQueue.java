package io.codeforall.bootcamp.bqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Blocking Queue
 *
 * @param <T> the type of elements stored by this queue
 */
public class BQueue<T> {
    private int limit;
    private LinkedList<T> queue;


    /**
     * Constructs a new queue with a maximum size
     *
     * @param limit the queue size
     */
    public BQueue(int limit) {
        queue = new LinkedList<T>();
        this.limit = limit;

        //throw new UnsupportedOperationException();

    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     *
     * @param data the data to add to the queue
     */
    public void offer(T data) {
        synchronized (this) {
            while (this.getSize() >= this.limit) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
            queue.offer(data);
            notifyAll();

            System.out.println("PIZZA MADE");
            System.out.println("Queue has: " + this.getSize() + " pizzas.");

        }

    }

    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     *
     * @return the data from the head of the queue
     */
    public T poll() {
        synchronized (this) {
            while (this.getSize() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            T data = queue.poll();
            System.out.println("Pizza eaten");
            System.out.println("Queue has: " + this.getSize() + " pizzas.");
            notifyAll();
            return data;
        }

        //throw new UnsupportedOperationException();

    }

    /**
     * Gets the number of elements in the queue
     *
     * @return the number of elements
     */
    public int getSize() {
        return this.queue.size();

        //throw new UnsupportedOperationException();

    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     *
     * @return the maximum number of elements
     */
    public int getLimit() {
        return this.limit;

        //throw new UnsupportedOperationException();

    }

}