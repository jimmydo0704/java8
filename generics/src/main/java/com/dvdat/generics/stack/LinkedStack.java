package com.dvdat.generics.stack;

public class LinkedStack<T> {
//    private static class Node<U> {
//        U item;
//        Node<U> next;
//
//        public Node(U item, Node<U> next) {
//            this.item = item;
//            this.next = next;
//        }
//
//        public Node() {
//            item = null;
//            next = null;
//        }
//
//        boolean end() { return item == null && next == null;}
//    }
//
//    Node<T> top = new Node<>();
//
//    public void push(T item) {
//        top = new Node<>(item, top);
//    }

    // Inner class can access the type of outer class. then, we
    // can do something as below
    // - Remove static keyword because LinkedStacked.this CANNOT referenced in static context
    // - Remove parameterized type
    private class Node {
        T item;
        Node next;

        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }

        public Node() {
            item = null;
            next = null;
        }

        boolean end() { return item == null && next == null;}
    }

    Node top = new Node();

    public void push(T item) {
        top = new Node(item, top);
    }


    // pop
    public T pop() {
        T result = top.item;
        if(!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s: "This is my string".split(" ")) {
            lss.push(s);
        }

        String s;
        while((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
