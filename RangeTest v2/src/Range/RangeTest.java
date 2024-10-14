package Range;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class RangeTest implements Iterable<T> {

    private Iterator<T> iterator;

    public RangeTest(int initial, int last) {

        iterator = new RangeIterator(initial, last);

    }
    @Override
    public Iterator<T> iterator() {

        return this.iterator;
    }
}
