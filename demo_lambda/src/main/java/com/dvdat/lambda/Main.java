package com.dvdat.lambda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Dat, It's lambda demo");

        // Lambda expression for Listener
        Button b = new Button();

        // Original way
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        b.addActionListener(actionEvent -> {
            // Do something
        });

        printSeperator();

        // Lambda expression for Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };

        Runnable r = () -> { // This is to execute block of code
            // Do something
            System.out.println("Runnable runs");
        };
        r.run();

        printSeperator();

        // Lambda expression for Collections
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ha Noi");
        cities.add("Ho Chi Minh");
        cities.add("Da Nang");
        cities.forEach(city -> {
            System.out.println("city: " +  city);
        });

        printSeperator();

        // Lambda expression for comparator
        Collections.sort(cities, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.compareTo(t1);
            }
        });

        Collections.sort(cities, (String s, String t1) -> s.compareTo(t1));  // This is to get return value

        cities.forEach(city-> {
           System.out.println(city);
       });

    }

    private static void printSeperator(){
        System.out.println("---------------------------------------");
    }
}
