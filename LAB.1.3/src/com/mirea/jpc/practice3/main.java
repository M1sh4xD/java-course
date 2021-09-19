package com.mirea.jpc.practice3;

import com.mirea.jpc.practice3.entities.Circle;
import com.mirea.jpc.practice3.movable.MovableCircle;
import com.mirea.jpc.practice3.movable.MovableRectangle;

public class main {

    public static void main(String[] args) {
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
