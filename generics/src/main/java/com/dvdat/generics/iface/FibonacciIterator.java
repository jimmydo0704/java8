package com.dvdat.generics.iface;

import java.util.Iterator;

public class FibonacciIterator extends Fibonacci implements Iterable<Integer> {
    private int n;

    public FibonacciIterator(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return FibonacciIterator.this.next();
            }
        };
    }

    public static void main(String[] args) {
        // Constructor sets a boundary
        // hasNext() knows when to stop
        for(int i : new FibonacciIterator(20)) {
            System.out.println(i);
        }
    }
}
