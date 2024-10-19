package com.everything_in_java.learning.basics;

public class IFelse {

    public static void main(String args[]){

        //basic if else

        int number = 10;
        int total = 0;

        if(number>0){
            System.out.println("number is positive");
        }else {
            System.out.println("number is positive");
        }

        //if-else if-else

        if(total>0){
            System.out.println("total is greater than zeo");
        } else if (total<0) {
            System.out.println("total is lesee than zeo");
        } else {
            System.out.println("total is equal to zeo");
        }

        //Nested if-else

        int age = 10;
        boolean hasLicense = true;

        if(age>=18){
            if (hasLicense){
                System.out.println("you are eligible to drive");
            }else {
                System.out.println("you are not eligible to drive without a license");
            }
        }else {
                System.out.println("you are too young to drive");
        }

        //turnery operator

        int n = 6;
        int result = 0;

        result = n%2==0 ? 10 : 20;
        System.out.println("result is: " + result);
    }
}
