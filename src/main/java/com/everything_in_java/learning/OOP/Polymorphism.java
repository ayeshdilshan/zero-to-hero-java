package com.everything_in_java.learning.OOP;

public class Polymorphism {

    //The ability of an object to identyfy more than one types

    public static void main(String args[]){

        Car car = new Car("Japan" , "alto" , 2020);
        Van van = new Van("caravan","red" , 2020);
        Bicycle bicycle = new Bicycle();

        Vehicle[] vehicles = {car,van,bicycle};

        for (Vehicle x: vehicles) {
            x.go();
        }
    }
}
