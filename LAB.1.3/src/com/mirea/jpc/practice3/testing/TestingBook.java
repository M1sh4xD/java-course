package com.mirea.jpc.practice2.testing;

import com.mirea.jpc.practice2.entities.Book;

public class TestingBook {
    public static void testingBook() {
        Book b1 = new Book("Lermontov", 9100234);
        Book b2 = new Book();
        Book b3 = new Book(81201285);

        b2.setISBN(38123451);
        b3.setAuthor("Bunin");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}