package com.mirea.jpc.practice2.testing;

import com.mirea.jpc.practice2.entities.Ball;

public class TestingBall {
    public static void testingBall() {
        Ball f1 = new Ball("Jack", "Red", 2);
        Ball f2 = new Ball();

        f2.setAge(1);
        f2.setColor("blue");
        f2.setName("Blueberry");

        System.out.println(f1);
        f1.punch();
    }
}