package com.javalearnings.Collection;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {
    private static String[] args;

    public static void main (String args[]) {


        HashSet<String> set = new HashSet<>();

        set.add("Blue");
        set.add("Yellow");
        set.add("Orange");

        set.add("Blue");

        System.out.println("Elements in HasHSet");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

            System.out.println("Contains 'Yellow' ?" + set.contains("Yellow"));

            set.remove("Orange");

            System.out.println("HashSet after removing 'Orange': " + set);


    }
}