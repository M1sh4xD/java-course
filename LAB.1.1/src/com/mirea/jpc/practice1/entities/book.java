package com.mirea.jpc.practice1.entities;

public class book {
    private String author;
    private int ISBN;

    public book(String author, int ISBN) {
        this.author = author;
        this.ISBN = ISBN;
    }

    public book() { // default constructor
        author = "Pushkin";
        ISBN = 90124811;
    }

    public book(int ISBN) { // find by ISBN
        author = "Lermontov";
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public int getISBN() {
        return ISBN;
    }

    public String toString() {
        return "ISBN: " + this.ISBN +
                " \n Author: " + this.author;
    }

}
