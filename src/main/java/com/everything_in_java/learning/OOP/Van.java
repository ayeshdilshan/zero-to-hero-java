package com.everything_in_java.learning.OOP;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Van {
    private String name;
    private String color;
    private int year;

    Van(String name , String color , int year) {
        this.name = name;
        this.color = color;
        this.year = year;
    }
}
