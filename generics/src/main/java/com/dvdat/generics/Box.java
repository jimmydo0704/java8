package com.dvdat.generics;

public class Box<T> {
    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    private T item;

    public Box(T t) {
        item = t;
    }
}
//
// This is original way. It's using Object class to store object. Then, it has
// no idea of what is actual type and it can lead to the problem that programmner
// can be mistaken to pass in one type then cast to other type and it's causing
// runtime exception.
//public class Box {
//    private Object item;
//
//    public Object getItem() {
//        return item;
//    }
//
//    public void setItem(Object item) {
//        this.item = item;
//    }
//
//    public Box(Object obj) {
//        item = obj;
//    }
//}