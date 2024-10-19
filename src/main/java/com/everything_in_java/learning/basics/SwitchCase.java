package com.everything_in_java.learning.basics;

public class SwitchCase {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String args[]){

        //switch with int

        int n = 5;

        switch (n){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sataurday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not a day of the week");

        }

        //switch with string

        String color = "red";

        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Caution");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid color");
        }

        //Enum in Switch

        Day day = Day.WEDNESDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Start of the week");
                break;
            case WEDNESDAY:
                System.out.println("Midweek");
                break;
            case FRIDAY:
                System.out.println("Almost weekend");
                break;
            default:
                System.out.println("Weekend!");
        }
    }
}
