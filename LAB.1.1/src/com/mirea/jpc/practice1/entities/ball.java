package com.mirea.jpc.practice1.entities;

public class ball {
    private String name, color;
    private int age;

    public ball(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public ball() {
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
