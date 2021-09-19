package com.mirea.jpc.practice1.entities;

public class Rectangle extends Shape{

    protected double width, length;

    public Rectangle() {
        super("Black", false);
        this.width = 6;
        this.length = 10;
    }

    public Rectangle(double width, double length) {
        super("Pink", true);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super (color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        return "\nRectangle\nWidth: " + width + "\nLength: " + length + "\nColor: " + color + "\nFilled: " + filled;
    }
}
