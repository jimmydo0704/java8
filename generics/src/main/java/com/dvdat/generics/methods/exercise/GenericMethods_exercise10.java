package com.dvdat.generics.methods.exercise;

//Exercise 10: (1) Modify the previous exercise so that one of f( )’s arguments is nonparameterized.
public class GenericMethods_exercise10 {
    public <T, U, V> void f(T t, U u, V v, String four) {
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(v.getClass().getName());
        System.out.println(four);
    }

    public static void main(String[] args) {
        GenericMethods_exercise10 genericMethods_exercise9 = new GenericMethods_exercise10();
        genericMethods_exercise9.f("String", 10, 'c', "Four parameter");
    }
}
