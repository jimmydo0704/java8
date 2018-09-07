package com.dvdat.generics.methods.exercise;

//Exercise 9: (1) Modify GenericMethods.java so that f( ) accepts three arguments, all
//        of which are of a different parameterized type.
public class GenericMethods_exercise9 {
    public <T, U, V> void f(T t, U u, V v) {
        System.out.println(t.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(v.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods_exercise9 genericMethods_exercise9 = new GenericMethods_exercise9();
        genericMethods_exercise9.f("String", 10, 'c');
    }
}
