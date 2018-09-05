package com.dvdat.generics;

public class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C> {
    public final D four;

    public FourTuple(A first, B second, C third, D four) {
        super(first, second, third);
        this.four = four;
    }

    public D getFour() {
        return four;
    }

    @Override
    public String toString() {
        return "FourTuple{" +
                "four=" + four +
                '}';
    }
}
