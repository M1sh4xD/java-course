package com.mirea.lesson1;

final public class Employee extends AbstractPerson{
    public Employee(String name) {
        super(name);
    }

    @Override
    public String think() {
        return Employee.class.getName();
    }
}