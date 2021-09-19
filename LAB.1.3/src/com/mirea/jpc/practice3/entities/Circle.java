package com.mirea.jpc.practice1.entities;

public class Circle extends Shape {

    protected double radius;

    public Circle() {
        super("Green", true);
        this.radius = 1;
    }

    public Circle(double radius) {
        super("Yellow", false);
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle\nRadius: " + this.radius + "\nColor: " + this.color + "\nFilled: " + filled;
    }

}
