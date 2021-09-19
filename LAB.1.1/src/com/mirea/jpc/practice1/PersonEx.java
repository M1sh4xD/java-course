// PersonException file

package com.mirea.lesson1;

public class PersonEx {

    private int age;
    private float height;
    private final String name;

    public PersonEx(String name) {
        this.name = name;
    }

    private static final int MAX_AGE = 200;
    private static final float MAX_HEIGHT = 2f;

    public void showInfo() {
        System.out.printf("age = %d, height = %f, name = %s", age, height, name);
    }

    public void setAge(int age) throws Exception {
        if (age > MAX_AGE) {
            throw new Exception("Exception: age > MAX_AGE");
        }
        if (age <= 0) {
            throw new Exception("Exception: age <= 0");
        } else {
            this.age = age;
        }
    }

    public void setHeight(float height) throws Exception {
        if (height > MAX_HEIGHT) {
            throw new Exception("Exception: height > MAX_HEIGHT");
        }
        if (height <= 0) {
            throw new Exception("Exception: height <= 0");
        } else {
            this.height = height;
        }
    }
}