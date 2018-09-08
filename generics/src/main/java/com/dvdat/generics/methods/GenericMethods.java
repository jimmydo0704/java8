package com.dvdat.generics.methods;

// NOTE:
// - Static method has no access to the generics type parameters of the class
// - When calling generic method the parameter type is not required as generic class
// because compiler will use type argument inference to support that
public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods var = new GenericMethods();
        var.f("String");
        var.f(10);
        var.f(100D);
        var.f('c');
    }
}
