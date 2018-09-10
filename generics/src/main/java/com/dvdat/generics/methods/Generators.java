package com.dvdat.generics.methods;

import com.dvdat.generics.iface.Coffee;
import com.dvdat.generics.iface.CoffeeGenerator;
import com.dvdat.generics.iface.Fibonacci;
import com.dvdat.generics.iface.Generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generators {
    public static <T> Collection<T> fill(Collection<T> col, Generator<T> gen, int n) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(gen.next());
        }

        return result;
    }

    // Exercise 13: load for List, Queue, Set

    public static void main(String[] args) {
        Collection<Coffee> coffeeList = fill(new ArrayList<>(), new CoffeeGenerator(), 10);
        coffeeList.forEach(coffee -> {
            System.out.println(coffee);
        });

        Collection<Integer> integerList = fill(new ArrayList<>(), new Fibonacci(), 20);
        integerList.forEach(integer -> {
            System.out.println(integer);
        });
    }
}
