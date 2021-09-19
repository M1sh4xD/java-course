package com.mirea.jpc.practice1.testing;

import com.mirea.jpc.practice1.entities.ball;
import com.mirea.jpc.practice1.entities.book;

public class TestingBall {
    public static void testingBall() {
        ball f1 = new ball("Jack", "Red", 2);
        ball f2 = new ball();

        f2.setAge(1);
        f2.setColor("blue");
        f2.setName("Blueberry");

        System.out.println(f1);
        f1.punch();
    }
}
