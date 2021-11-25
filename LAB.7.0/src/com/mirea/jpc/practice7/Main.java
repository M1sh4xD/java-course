package com.mirea.jpc.practice7;

import com.mirea.jpc.practice7.movable.MovableCircle;
import com.mirea.jpc.practice7.movable.MovablePoint;

public class Main {
    public static void main(String [] args) {
        System.out.println(new MovableCircle(3,3,1,1,9));
        System.out.println(new MovablePoint(12,24,11,31));

        MovablePoint movablePoint = new MovablePoint(3,3,1,1);
        System.out.println(movablePoint);
        movablePoint.moveDown();
        movablePoint.moveLeft();
        for (int i = 0; i<=9; i++) {
            movablePoint.moveUp();
            movablePoint.moveRight();
        }
        System.out.println(movablePoint);

        MovableCircle movableCircle = new MovableCircle(3,3,1,1, 2);
        System.out.println(movableCircle);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        for (int i = 0; i<=9; i++) {
            movableCircle.moveUp();
            movableCircle.moveRight();
        }
        System.out.println(movableCircle);

    }
}
