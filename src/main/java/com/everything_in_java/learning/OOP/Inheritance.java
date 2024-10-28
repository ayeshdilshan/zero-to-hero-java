package com.everything_in_java.learning.OOP;

public class Inheritance {

// the process where one class acquires, the attributes and methods of another
public static void main(String args[]){

    Car car = new Car("Sri Lanka", "alto", 2023);
    Van van = new Van("caravan" , "white" , 2020);

    car.go();
    van.stop();

}
}
