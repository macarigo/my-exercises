import java.util.Iterator;

import Range.RangeTest;

public class Main {

    public static void main(String[] args) {

        RangeTest r = new RangeTest(-5, 5);

        System.out.println("--- USING ITERATOR ---");
        Iterator<Integer> it = r.iterator();

        // REMOVER
        while (it.hasNext()) {

            Integer i = it.next();

            if (i == 1 || i == 2 || i == 3) {
                it.remove();
            }
        }

        // ITERAR
        for (Integer j : r) {
            System.out.println("Iterated: " + j);
        }


    }




    // I will have an entity which will be an iterable container which I will call Range
    // I will have an iterator entity which will have the rules to iterate over something iterable aka the Range
    // The Range will be all Integers (numbers)
    // someNumber + 1 will be how I pass to the next element in my iterable container
    // someNumber == lastNumber will be how I know where I ended my iteration


}
