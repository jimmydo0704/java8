package com.dvdat.generics;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D> {
    public final E five;

    public FiveTuple(A first, B second, C third, D four, E five) {
        super(first, second, third, four);
        this.five = five;
    }

    public E getFive() {
        return five;
    }

    @Override
    public String toString() {
        return "FiveTuple{" +
                "five=" + five +
                '}' + super.toString();
    }
}
