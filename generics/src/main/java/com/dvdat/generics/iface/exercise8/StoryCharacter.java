package com.dvdat.generics.iface.exercise8;

public class StoryCharacter {
    private static int count = 0;
    private int id = count++;

    @Override
    public String toString() {
        return "StoryCharacter{" +
                getClass().getSimpleName() +
                ", id=" + id +
                '}';
    }
}
