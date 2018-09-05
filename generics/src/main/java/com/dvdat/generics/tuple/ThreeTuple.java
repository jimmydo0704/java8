package com.dvdat.generics.tuple;

public class ThreeTuple<A, B, C> extends TwoTuple<A, B> {
    public final C third;

    ThreeTuple(A first, B second, C third) {
        super(first, second);
        this.third = third;
    }

    public C getThird() {
        return third;
    }
}
