package com.mirea.lesson1;

public abstract class AbstractPerson implements HumanInterface {

    private String name;

    public String getName() {
        return name;
    }

    public AbstractPerson(String name) {
        this.name = name;
    }
}