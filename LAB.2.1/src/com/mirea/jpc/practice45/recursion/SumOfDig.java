package com.mirea.jpc.practice45.recursion;

public class SumOfDig { // the figure total
    // EXAMPLE: the figure total of 35 is 8

    private static int sum = 0;

    public static void doDispose() {
        sum = 0;
    }

    public static int doSum(int n) {
        sum += n % 10;
        if (n == 0) {
            System.out.println(sum);
        } else {
            doSum(n / 10);
        }
        return sum;
    }
}