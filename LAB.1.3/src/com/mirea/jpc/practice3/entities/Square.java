package com.mirea.jpc.practice3.entities;

public class Square extends Rectangle{

    public Square() {

    }

    public Square(double side) {
        width = side;
    }

    public Square(double side, String color, boolean filled) {
        width = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
    }

    @Override
    public void setWidth(double side) {
        width = side;
    }

    @Override
    public void setLength(double side) {
        length = side;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
