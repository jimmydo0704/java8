package com.dvdat.generics.iface;

public class Coffee {
    private static long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Coffee{" +
                getClass().getSimpleName() +
                ", id=" + id +
                '}';
    }
}
