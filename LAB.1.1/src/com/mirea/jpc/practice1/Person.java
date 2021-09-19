// Main Person file

package com.mirea.jpc.practice1;

public class Person {

    private int age;
    private float height;
    private String name;

    public Person(float height, String name) {
        this.height = height;
        this.name = name;
    }

    public void showInfo() {
        System.out.printf("age = %d, height = %f, name = %s", age, height, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enum Gender {
        MALE(1, "Man"),
        FEMALE(2, "Woman"),
        OTHER(404, "Other");

        private final int val;
        private final String strVal;

        Gender(int val, String strVal) {
            this.val = val;
            this.strVal = strVal;
        }

        int getVal() {
            return val;
        }

        String getStrVal() {
            return strVal;
        }
    }
}
