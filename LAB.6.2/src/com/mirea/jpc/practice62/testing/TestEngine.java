package com.mirea.jpc.practice62.testing;

import com.mirea.jpc.practice62.models.MyArrayList;

public class TestEngine {
    public static void testingArray() {

        MyArrayList<String> list = new MyArrayList<>();

        System.out.println(list.isEmpty());

        list.add("One");
        list.add("Two");
        list.add(1, "inserted_two");

        System.out.println(list.toString());

        System.out.println(list.size());

        System.out.println(list.isEmpty());
        list.clear();

        System.out.println(list.isEmpty());
    }
}