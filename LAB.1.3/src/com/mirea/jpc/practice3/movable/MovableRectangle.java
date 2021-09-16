package com.mirea.jpc.practice3.movable;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft, bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    private boolean isEqual() {
        return topLeft.xSpeed != bottomRight.xSpeed ||
                topLeft.ySpeed != bottomRight.ySpeed;
    }

    public String toString() {
        String topLeftS = "x = " + topLeft.x + ", y = " + topLeft.y;
        String bottomRightS = "x = " + bottomRight.x + ", y = " + bottomRight.y;
        return "\ntopLeftString: " + topLeftS + "\nbottomRightString: " + bottomRightS
                + "\nxSpeed = " + topLeft.xSpeed + ", ySpeed = " + topLeft.ySpeed;
    }

    @Override
    public void moveUp() {
        if(isEqual()) return;
        ++topLeft.y;
        ++bottomRight.y;
    }

    @Override
    public void moveDown() {
        if (isEqual()) return;
        --topLeft.y;
        --bottomRight.y;
    }

    @Override
    public void moveLeft() {
        if (isEqual()) return;
        --topLeft.x;
        --bottomRight.x;
    }

    @Override
    public void moveRight() {
        if (isEqual()) return;
        ++topLeft.x;
        ++bottomRight.x;
    }
}
