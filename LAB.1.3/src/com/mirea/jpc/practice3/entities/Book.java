package com.mirea.jpc.practice2.entities;

public class Book {
    private String author;
    private int ISBN;

    public Book(String author, int ISBN) {
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book() { // default constructor
        author = "Pushkin";
        ISBN = 90124811;
    }

    public Book(int ISBN) { // find by ISBN
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