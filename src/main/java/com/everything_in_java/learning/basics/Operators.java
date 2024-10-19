package com.everything_in_java.learning.basics;

public class Operators {
    public static void main(String args[]){

        // 1. Arithmetic Operators:

        int a = 5;
        int b = 5;

        System.out.println("addition: " + (a+b));
        System.out.println("subtraction: " + (a-b));
        System.out.println("multiplication: " + (a*b));
        System.out.println("division: " + (a/b));
        System.out.println("modules: " + (a%b));

        // 2. Logical Operators:

        boolean c = true;
        boolean d = false;

        System.out.println("Logical AND: " + (c && d));
        System.out.println("Logical OR: " + (c || d));
        System.out.println("Logical NOT: " + (!c));
        System.out.println("Logical NOT: " + (!d));

        // 3. Relational (Comparison) Operators:

        System.out.println("equal to: " + (a == b));
        System.out.println("not equal to: " + (a != b));
        System.out.println("greater than: " + (a > b));
        System.out.println("less than: " + (a < b));
        System.out.println("greater than or equal to: " + (a >= b));
        System.out.println("less than or equal to: " + (a <= b));

        //Arithmetic Operators perform mathematical operations.
        //Logical Operators combine multiple boolean expressions.
        //Relational Operators compare two values or expressions and return a boolean.
    }
}
