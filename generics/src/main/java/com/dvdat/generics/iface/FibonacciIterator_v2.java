package com.dvdat.generics.iface;

import java.util.Iterator;

// Exercise 7 - part Generics Interface
// this version intend to use composition instead of inheritance as
// FibonacciIterator
public class FibonacciIterator_v2 implements Iterable<Integer> {
    private int n;
    Fibonacci fibonacci = new Fibonacci();

    public FibonacciIterator_v2(int n) {
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
                return fibonacci.next();
            }
        };
    }

    public static void main(String[] args) {
        // Constructor sets a boundary
        // hasNext() knows when to stop
        for(int i : new FibonacciIterator_v2(20)) {
            System.out.println(i);
        }
    }
}
