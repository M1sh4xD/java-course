package com.mirea.jpc.practice22;

public class MyString {
    private final char[] myString;

    MyString() {
        myString = new char[1];
        myString[0] = ' ';
    }

    MyString(char[] value) {
        myString = new char[value.length];
        for (int i = 0; i < value.length; i++)
            myString[i] = value[i];
    }

    MyString(String str) {
        myString = str.toCharArray();
    }

    MyString(MyString my_string) {
        myString = my_string.myString;
    }

    public boolean isEmpty() {
        return myString.length == 0;
    }

    public int length() {
        return myString.length;
    }

    public int compareTo(MyString str) {
        if (myString.length == str.myString.length) {
            for (int i = 0; i < myString.length; i++) {
                if (myString[i] > str.myString[i]) return 1;
                else if (myString[i] < str.myString[i]) return -1;
                else
                    return 0;
            }
        } else if (myString.length > str.myString.length) return 1;
        return -1;
    }

    public MyString trim() {
        char[] new_string = new char[myString.length - 1];
        for (int i = 0; i < myString.length - 1; i++)
            new_string[i] = myString[i];

        return new MyString(String.valueOf(new_string));
    }

    @Override
    public String toString() {
        return new String(String.valueOf(myString));
    }


    public MyString concat(MyString str) {
        char[] new_string = new char[myString.length + str.myString.length];
        for (int i = 0; i < myString.length; i++)
            new_string[i] = myString[i];
        for (int i = myString.length, j = 0; i < myString.length + str.myString.length; i++, j++)
            new_string[i] = str.myString[j];
        return new MyString(String.valueOf(new_string));
    }

    public MyString substring(int start, int end) { // from to not including
        try {
            char[] new_str = new char[end - start];
            for (int i = 0; i + start < end; i++)
                new_str[i] = myString[i + start];
            return new MyString(String.valueOf(new_str));
        } catch (NegativeArraySizeException e) {
            return null; // caught error
        }
    }


    public char charAt(int index) {
        if (index >= 0 && index < myString.length)
            return myString[index];
        else
            return '~';
    }

}