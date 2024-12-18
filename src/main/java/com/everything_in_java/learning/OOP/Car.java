package com.everything_in_java.learning.OOP;

public class Car extends Vehicle {

    private String make;
    private String model;
    private int year;

    Car(String make , String model , int year) {
        this.make = make;
        this.model = model;
        this.year = year;

        setMake(make);
    }


    public String getMake() {
        return  make;
    } public String getModel() {
        return  model;
    } public int getyear() {
        return  year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public void go(){
        System.out.println("Car begins go");
    }
}
