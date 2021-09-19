package com.mirea.jpc.practice1;

final public class Employee extends AbstractPerson{
    public Employee(String name) {
        super(name);
    }

    @Override
    public String think() {
        return Employee.class.getName();
    }
}
