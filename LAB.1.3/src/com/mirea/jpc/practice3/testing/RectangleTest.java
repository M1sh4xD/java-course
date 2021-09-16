package com.mirea.jpc.practice3.testing;

import com.mirea.jpc.practice3.entities.Rectangle;
import com.mirea.jpc.practice3.entities.Shape;

public class RectangleTest {
    public void checkTest() {
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); parent class doesn`t have access to the methods of the child classes

        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
    }
}
