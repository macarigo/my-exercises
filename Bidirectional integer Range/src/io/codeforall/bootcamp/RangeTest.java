package io.codeforall.bootcamp;

import java.util.Iterator;

/**
 * Created by ferrao on 30/05/16.
 */
public class RangeTest {

    public static void main(String[] args) {

        Range r = new Range(-5, 5);


        System.out.println("--- USING FWD ITERATOR ---");
        Iterator<Integer> it = r.iterator();

        for (Integer i : r) {
            System.out.println("Iterated: " + i);
        }

        System.out.println("--- USING REVERSE ITERATOR ---");
        r.setInverted(true);
        for (Integer i : r) {
            System.out.println("Iterated: " + i);
        }
    }
}
