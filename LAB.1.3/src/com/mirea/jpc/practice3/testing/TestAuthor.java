package com.mirea.jpc.practice3.testing;

import com.mirea.jpc.practice3.entities.Author;

public class TestAuthor {
    public static void checkTest() {
        Author a1 = new Author("Alexander Pushkin", "puskin@mirea.ru", 'M');
        a1.setEmail("pushkin@mirea.ru");
        System.out.println(a1);
    }
}
