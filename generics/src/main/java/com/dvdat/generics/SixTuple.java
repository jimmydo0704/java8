package com.dvdat.generics;

public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E> {
    public final F six;

    public SixTuple(A first, B second, C third, D four, E five, F six) {
        super(first, second, third, four, five);
        this.six = six;
    }

    public F getSix() {
        return six;
    }

    public static void main(String[] args) {
        SixTuple<String, Integer, Float, Double, String, Integer> tuple = new SixTuple<>("First", 2, 3.0F, 4.0D, "five", 6 );
        System.out.println(tuple);
    }

}
