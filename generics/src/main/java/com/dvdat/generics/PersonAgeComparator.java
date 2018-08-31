package com.dvdat.generics;

import java.util.Comparator;

// Generics implement a generic type
public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
