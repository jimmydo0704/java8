package com.dvdat.generics.methods;

import java.util.List;
import java.util.Map;

public class LimitsOfTypeInference {
    static void f(Map<Person, List<? extends Pet>> peoplePet) {}

    public static void main(String[] args) {
        // It works in JDK 8. it does not work in previous version as in Thinking In Java 4th Edition???
        f(New.map());
    }
}
