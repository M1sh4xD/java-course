package com.mirea.jpc.practice1.testing;

import com.mirea.jpc.practice1.entities.book;

public class TestingBook {
    public static void testingBook() {
        book b1 = new book("Lermontov", 9100234);
        book b2 = new book();
        book b3 = new book(81201285);

        b2.setISBN(38123451);
        b3.setAuthor("Bunin");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
