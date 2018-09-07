package com.dvdat.generics.iface;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Mocha.class, Latte.class, Americano.class, Breve.class, Capuchino.class};
    private static Random rand = new Random(47);

    public CoffeeGenerator() {}

    private int size = 0;

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    @Override
    public Coffee next() {
        try {
            return (Coffee) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }
    }

    public static void main(String[] args) {
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }

        // Why? What supports it?
        // ==>
        // CoffeeGenerator implements Iterable interface, so it can be use in foreach statement.
        // However, it requires an "end sentinel" to know when to stop and this produces using the
        // second constructor
        for(Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }
    }
}
