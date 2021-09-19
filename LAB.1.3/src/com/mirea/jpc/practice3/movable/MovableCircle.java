package com.mirea.jpc.practice3.movable;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "\nx = " + center.x
                + "\ny = " + center.y
                + "\nxSpeed = " + center.xSpeed
                + "\nySpeed = " + center.ySpeed
                + "\nradius = " + radius;
    }

    @Override
    public void moveUp() {
        ++center.y;
    }

    @Override
    public void moveDown() {
        --center.y;
    }

    @Override
    public void moveLeft() {
        --center.x;
    }

    @Override
    public void moveRight() {
        ++center.x;
    }
}
