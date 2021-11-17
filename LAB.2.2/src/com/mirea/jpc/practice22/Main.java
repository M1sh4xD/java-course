package com.mirea.jpc.practice22;

public class Main {
    public static void main(String[] args) {
        MyString str1 = new MyString("Hello");
        MyString str2 = new MyString("World");
        MyString str3 = new MyString();
        MyString cstr4 = new MyString("World");
        MyString cstr4_1 = new MyString("wOrldd");
        MyString str5 = new MyString("Worldd");
        MyString temp = new MyString();

        System.out.println(str1.toString());
        System.out.println(str2.toString());
        System.out.println(str3.toString());

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());
        System.out.println(str3.isEmpty());

        System.out.println("len of str1 is " + str1.length());
        System.out.println("len of str2 is " + str2.length());
        System.out.println("len of str3 is " + str3.length());

        System.out.println(str2.compareTo(str1));
        System.out.println(str2.compareTo(cstr4));
        System.out.println(str2.compareTo(cstr4_1));

        System.out.println(str5.trim());

        temp = str1.concat(str2);
        System.out.println(temp);

        System.out.println(str1.substring(1,3));
        System.out.println(cstr4_1.substring(1,4));
        System.out.println(str2.substring(33,5));

        System.out.println(cstr4_1.charAt(1));
        System.out.println(temp.charAt(222));




    }
}
