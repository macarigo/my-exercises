package io.codeforall.bootcamp;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Integer range iterator
 */
public class Range implements Iterable<Integer> {

    private int min;
    private int max;

    private boolean[] removed;
    private boolean isInverted;

    public Range(int val1, int val2) {
        if (val1 > val2) {
            this.isInverted = true;
            this.max = val1;
            this.min = val2;
        } else {
            this.min = val1;
            this.max = val2;
            isInverted = false;
        }

        //The size of array is +1 to be inclusive of both min and max
        removed = new boolean[max - min + 1];
    }

    public void setInverted(boolean isInverted) {
        this.isInverted = isInverted;
    }

    @Override
    public Iterator<Integer> iterator() {
        if (isInverted) {
            return new BackRangeIterator();
        }
        return new FwdRangeIterator();
    }

    private class BackRangeIterator implements Iterator<Integer> {
        private int current;

        public BackRangeIterator() {
            this.current = max + 1;
        }

        @Override
        public boolean hasNext() {
            while (removedContains(current - 1)) {
                current--;
            }

            return current > min;
        }

        private boolean removedContains(int current) {
            // First we need to check if the current number above the max value
            return current >= min && removed[current + max];
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            current--;
            return current;
        }

        @Override
        public void remove() {

            // if you try to remove an element before calling next(), you will get a runtime exception (see Iterable:remove() description)
            if (current > max) {
                throw new IllegalStateException("You need to call next() at least once to remove an element.");
            }

            // if you try to call remove() consecutively you will get a runtime exception (see Iterable:remove() description)
            if (removedContains(current)) {
                throw new IllegalStateException("You cannot call remove() repeatedly");
            }

            removed[current + max] = true;
        }
    }

    private class FwdRangeIterator implements Iterator<Integer> {

        private int current;

        public FwdRangeIterator() {
            // start this iterator with the "current number" just before the min value.
            // You need to call next() to get the first element.
            current = min - 1;
        }

        @Override
        public boolean hasNext() {

            // check if the next number is removed.
            // if it is.... keep checking if the following numbers are removed.
            while (removedContains(current + 1)) {
                current++;
            }

            return current < max;
        }

        private boolean removedContains(int current) {
            // First we need to check if the current number above the max value
            return current <= max && removed[current - min];
        }

        @Override
        public Integer next() {

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            current++;
            return current;
        }

        @Override
        public void remove() {

            // if you try to remove an element before calling next(), you will get a runtime exception (see Iterable:remove() description)
            if (current < min) {
                throw new IllegalStateException("You need to call next() at least once to remove an element.");
            }

            // if you try to call remove() consecutively you will get a runtime exception (see Iterable:remove() description)
            if (removedContains(current)) {
                throw new IllegalStateException("You cannot call remove() repeatedly");
            }

            removed[current - min] = true;
        }

    }

}
