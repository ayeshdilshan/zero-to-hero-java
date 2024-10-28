package com.everything_in_java.learning.practise;

public class DefaultValues {
    int x;
    double d;
    float r;

    String s;
    public static void main(String args[]){

        DefaultValues example = new DefaultValues();

        System.out.println("default value for int: " + example.x);
        System.out.println("default value for String: " + example.s);
        System.out.println("default value for double: " + example.d);
    }
}
