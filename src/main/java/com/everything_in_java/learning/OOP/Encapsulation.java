package com.everything_in_java.learning.OOP;


public class Encapsulation {
    //attributes of a class will be hidden or private, can be only access through methods(getters & setters)
    // should make attributes private if you don't have a reason to make them public or protected
    public static void main(String args[]){
        Car car = new Car("Sri Lanka", "alto", 2023);

        car.setMake("india");

        Van van = new Van("caravan" , "white" , 2020);
        van.setColor("red");

        //access Car Class attributes of defined getter and setter methods
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getyear());

        //access Van Class attributes using lombok Getter and setter attributes
        System.out.println(van.getName());
        System.out.println(van.getColor());
        System.out.println(van.getYear());

        //after set new data to car attributes
        System.out.println(car.getMake());
        System.out.println(van.getColor());
    }
}
