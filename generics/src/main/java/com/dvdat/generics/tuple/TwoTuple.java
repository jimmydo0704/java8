package com.dvdat.generics.tuple;

public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public TwoTuple(A f, B s) {
        first = f;
        second = s;
    }
}
