package com.mirea.jpc.practice2.entities;

public class Ball {
    private String name, color;
    private int age;

    public Ball(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Ball() {
        name = "jack";
        color = "red";
        age = 2;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return (this.name).toUpperCase() +
                " with color " +
                (this.color).toUpperCase() +
                " and age " +
                this.age + " years old";
    }

    public void punch() {
        System.out.println("just flew " +
                ((Math.random() * 25) / age * 0.8) + " meters!");
    }
}
