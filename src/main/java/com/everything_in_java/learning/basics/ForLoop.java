package com.everything_in_java.learning.basics;

public class ForLoop {
    public static void main(String args[]){

        int [] numbers = {10,20,30,40,50};

        //Simple for Loop

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }



        //Loop with Multiple Variables

        for (int i = 1, j = 5; i<5; i++, j-- ) {
            System.out.println("i: " + i + ", j: " + j);
        }



        //for Loop with Arrays

        for (int i = 1; i< numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }



        //Infinite for Loop

//        for (;;) {
//            System.out.println("This will run forever!");
//        }



        // Using break in a for Loop

        for (int i = 1; i<=5; i++) {
            if (i==4) {
                break;
            }
            System.out.println("i : " + i);
        }
        System.out.println("break Loop exited.");




        //Skipping an Iteration Using continue

        for (int i = 1; i<=5; i++) {
            if (i==4) {
                continue;
            }
            System.out.println("i : " + i);
        }
        System.out.println("Iteration Using continue Loop exited.");




        //for-each loop

        for (int number: numbers) {
            System.out.println("number is: " + number);
        }
    }
}
