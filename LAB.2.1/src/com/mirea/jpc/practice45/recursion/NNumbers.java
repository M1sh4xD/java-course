package com.mirea.jpc.practice45.recursion;
// Natural numbers

import java.lang.reflect.Array;
import java.util.Scanner;

public class NNumbers { // natural number gap

    public static String temp = " ";

    public static void doNNumbers(int n) { // by default count from 1 to n
        doNNumbers(n, 1);
    }

    public static void doNNumbers(int n, int count) {
        temp += count + " ";
        System.out.println(count);
        if (count == n) return;
        doNNumbers(n, ++count);
    }

    public static void doDispose() {
        temp = " ";
    }
}