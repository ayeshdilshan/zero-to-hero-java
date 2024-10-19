package com.everything_in_java.learning.basics;

import java.util.Scanner;

public class WhileAndDoWhileLoop {

    public static void main(String args[]){


        int count = 1;
        int sum = 1;
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int i = 1;
        int n = 1;



        //basic while loop

        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;  // increment the counter to avoid an infinite loop
        }



        //while loop with user input

        while (!input.equalsIgnoreCase("exit")){
            System.out.print("Type something (or type 'exit' to quit): ");
            input = scanner.nextLine();
            System.out.println("You typed: " + input);
        }
            System.out.println("Goodbye!");



        //Breaking a while Loop Using break

        while (i<=10) {
            if (i==5) {
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("loop exited");



        //do while loop
        // basic do while loop

        do {
            System.out.println("Do while sum is: " + sum);
            sum ++;
        }while (sum<=5);




        //do-while Loop with User Input

        do {
            System.out.print("Enter something (type 'exit' to quit): ");
            input = scanner.nextLine();
            System.out.println("You entered: " + input);
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Goodbye!");



        //Breaking a do-while Loop

        do {
            System.out.println("n: " + n);
            if (n == 3) {
                break;  // Exit the loop when i is 3
            }
            n++;
        } while (n <= 5);
        System.out.println("Loop exited.");
    }
}
