package com.mirea.jpc.practice1;

import com.mirea.jpc.practice1.testing.TestingBall;
import com.mirea.jpc.practice1.testing.TestingBook;
import com.mirea.jpc.practice1.entities.Circle;
import com.mirea.jpc.practice1.movable.MovableCircle;
import com.mirea.jpc.practice1.movable.MovableRectangle;


public class main {
    public static void main(String[] args) {
        TestingBall.testingBall();
        TestingBook.testingBook();
        Circle c1 = new Circle(2, "Green", true);
        System.out.println(c1);

        MovableCircle s1 = new MovableCircle(3,5,6,6, 2);

        for (int i = 0; i<=20; i++) {
            s1.moveUp();
            s1.moveLeft();
        }

        System.out.println(s1);

        MovableRectangle r1 = new MovableRectangle(5, 2,4, 6,2,1);

        r1.moveDown();
        r1.moveDown();
        r1.moveRight();
        r1.moveRight();

        System.out.println(r1);
    }
}
