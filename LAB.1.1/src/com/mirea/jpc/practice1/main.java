package com.mirea.jpc.practice1;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        PersonEx person = new PersonEx(name);
        try {
            person.setAge(in.nextInt());
            person.setHeight(in.nextInt());
        } catch (Exception e) {
            e.printStackTrace();
        }
        person.showInfo();
        System.out.println();

        Employee employee = new Employee("Ivan-Employer");
        Client client = new Client("Petr-client");

        System.out.println(employee.getName() + " " + client.getName() + " " +
                client.getName() + " " + employee.think() + " " + client.think());
    }
}
