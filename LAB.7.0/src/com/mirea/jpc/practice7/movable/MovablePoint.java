package com.mirea.jpc.practice7.movable;

public class MovablePoint implements Movable {

    int x,y,xSpeed,ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "\nx = " + x + "\ny = " + y + "\nxSpeed = " + xSpeed
                + "\nySpeed = " + ySpeed;
    }


    @Override
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}
