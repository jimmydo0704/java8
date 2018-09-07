package com.dvdat.generics.iface.exercise8;

import com.dvdat.generics.iface.Generator;

import java.util.Iterator;
import java.util.Random;

public class StoryCharacterGenerator implements Generator<StoryCharacter>, Iterable<StoryCharacter> {
    private Class[] types = {GoodGuys.class, BadGuys.class};
    Random rand = new Random(10);

    int size;

    public StoryCharacterGenerator(int size) {
        this.size = size;
    }

    @Override
    public StoryCharacter next() {
        try {
            return (StoryCharacter) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacter> iterator() {
        return new Iterator<StoryCharacter>() {
            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public StoryCharacter next() {
                size--;
                return StoryCharacterGenerator.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for(StoryCharacter c : new StoryCharacterGenerator(15)) {
            System.out.println(c);
        }
    }
}
