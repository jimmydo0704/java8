package com.dvdat.generics.methods;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<>();
        for (T arg : args) {
            result.add(arg);
        }
        return result;
    }
}
