package com.dvdat.generics;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Dat Do", 35));
        persons.add(new Person("Phung Nguyen", 34));
        persons.add(new Person("Ngoc Do", 2));

        persons.forEach(person -> {
            System.out.println(person);
        });

        printSeperator();
        // TODO
        // Implement generics type
        // Ref: PersonAgeComparator
        Collections.sort(persons, new PersonAgeComparator());
        persons.forEach(person -> {
            System.out.println(person);
        });

        // Passing a parameter to a generic class
        // Ref: ReverseComparator class
        printSeperator();
        Collections.sort(persons, new ReverseComparator<>(new PersonAgeComparator()));
        persons.forEach(person -> {
            System.out.println(person);
        });

        // Raw type
        // Warning: unchecked call/invocation
        Box rawBox = new Box(100);
        rawBox.setItem(10);

        // Interface

        // Class
        //  - To ensure type safe at compile time instead of Runtime error
        // Ref: Box

        // Method

        // Type inference

        // Wildcard
        //  - Upper
        //  - Lower
        //  - Unbounded

        // Bounded type
        //  - Single
        //  - Multiple

        // Substitution

        // Covariant

        // Contravariant

        // Raw type

        // Reflection

        // Factional interface

        // Intersection type
    }

    private static void printSeperator(){
        System.out.println("---------------------------------------");
    }
}
