package com.mirea.jpc.practice45.recursion;

public class Range { // output the gap

    public static String temp = " ";

    public static void doRange(int a, int b) {
        if (a < b) {
            System.out.println(a);
            temp += a + " ";
            doRange(++a, b);
        } else if (a > b) {
            System.out.println(a);
            temp += a + " ";
            doRange(--a, b);
        } else {
            System.out.println(a);
            temp += a + " ";
        }
    }

    public static void doDispose() {
        temp = " ";
    }
}